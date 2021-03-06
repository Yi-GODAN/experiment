package setup3;

public class MainClass16 extends Object {
    private static Runnable makeRunnable() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    Thread t = Thread.currentThread();
                    System.out.println("in run() - priority = "
                            + t.getPriority() + ", name = " + t.getName());
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        return r;
    }

    public static void main(String[] args) {
        System.out.println("in main() - Thread.currentThread().getPriority() = "
                + Thread.currentThread().getPriority());
        System.out.println("in main() - thread.currentThread().getName() = "
                + Thread.currentThread().getName());
        Thread threadA = new Thread(makeRunnable(), "threadA");
        threadA.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("in main() - threadA.getPriority() = "
                    + threadA.getPriority());
        }

    }
}
