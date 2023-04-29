public class Serveur {
    private int port;
    private static int DEFAULT_PORT;

    private Serveur(){
        this.port=DEFAULT_PORT;
    }
     

    public void start(){
        System.out.println("Serveur à l'écoute sur le port "+this.port);
    }

   
}