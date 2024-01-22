package coursenligne;

public class TestThread {
    int x = 0, y = 0, r1=0,r2=0;
    String lock = new String();

    public void m1() {
        x = 1;
        synchronized (lock) {
            y = 1;
        }
    }

    public void m2() {
        synchronized (lock) {
            r1 = y;
        }
        r2 = x;
    }

    public static void main(String[] args) {
        TestThread obj = new TestThread();

        Thread t = new Thread(() -> {
            synchronized (obj.lock) {
                obj.m1();
            }
        });

        Thread t1 = new Thread(() -> {
            synchronized (obj.lock) {
                obj.m2();
            }
        });

        t.start();
        t1.start();
        
        // try {
        //     t.join();
        //     t1.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // Le lien "happens-before" entre les threads t et t1 est établi ici
        System.out.println("r1: " + obj.r1 + ", r2: " + obj.r2);
    }
}
