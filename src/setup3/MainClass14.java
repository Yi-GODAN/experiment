package setup3;

public class MainClass14 extends Object implements Runnable {
    private ThreadID var;

    public MainClass14(ThreadID v) {
        this.var = v;
    }

    public static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }

    public void run() {
        try {
            print("var getThreadID = " + var.getThreadID());
            Thread.sleep(2000);
            print("var getThreadID = " + var.getThreadID());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadID tid = new ThreadID();
        MainClass14 shared = new MainClass14(tid);

        try {
            Thread threadA = new Thread(shared, "threadA");
            threadA.start();

            Thread.sleep(500);

            Thread threadB = new Thread(shared, "threadB");
            threadB.start();

            Thread.sleep(500);

            Thread threadC = new Thread(shared, "threadC");
            threadC.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadID extends ThreadLocal {
    private int nextID;

    public ThreadID() {
        nextID = 10001;
    }

    private synchronized Integer getNewID() {
        Integer id = Integer.valueOf(nextID);
        nextID++;
        return id;
    }

    protected Object initialValue() {
        print("in initialValue()");
        return getNewID();
    }

    public int getThreadID() {
        Integer id = (Integer) get();
        return id.intValue();
    }

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }
}