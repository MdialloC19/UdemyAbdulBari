import java.security.SecureRandom;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SessionManager {
    
    private static final int SESSION_TIMEOUT = 1800; // Durée de vie de la session (en secondes)
    private static final int SESSION_ID_LENGTH = 32; // Longueur de l'identifiant de session
    
    private static SessionManager instance = new SessionManager();
    private Map<String, Session> sessionMap = new ConcurrentHashMap<>(); // Map pour stocker les sessions
    
    private SessionManager() {}
    
    public static SessionManager getInstance() {
        return instance;
    }
    
    public Session startSession(User user) {
        String sessionId = generateSessionId();
        Session session = new Session(sessionId, user);
        sessionMap.put(sessionId, session);
        return session;
    }
    
    public Session getSession(String sessionId) {
        Session session = sessionMap.get(sessionId);
        if (session != null && session.isValid()) {
            return session;
        }
        return null;
    }
    
    public void endSession(String sessionId) {
        sessionMap.remove(sessionId);
    }
    
    private String generateSessionId() {
        SecureRandom random = new SecureRandom();
        byte[] sessionIdBytes = new byte[SESSION_ID_LENGTH];
        random.nextBytes(sessionIdBytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(sessionIdBytes);
    }
    
    public static class Session {
        
        private String sessionId;
        private User user;
        private long startTime;
        
        public Session(String sessionId, User user) {
            this.sessionId = sessionId;
            this.user = user;
            this.startTime = System.currentTimeMillis();
        }
        
        public String getSessionId() {
            return sessionId;
        }
        
        public User getUser() {
            return user;
        }
        
        public boolean isValid() {
            long currentTime = System.currentTimeMillis();
            long sessionDuration = (currentTime - startTime) / 1000;
            return sessionDuration <= SESSION_TIMEOUT;
        }
    }
}
