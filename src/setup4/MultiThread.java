package setup4;

public class MultiThread {
    public static void main(String[] args) {
        System.out.println("main thread starts...");
        SpeakThread thread = new SpeakThread();
        thread.start();
//		try{Thread.sleep(1);}catch(Exception e){}		//休眠10秒
        System.out.println("I'm eating...");
        System.out.println("main thread ends..");
    }
}
