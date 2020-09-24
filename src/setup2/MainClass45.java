package setup2;

public class MainClass45 {

    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.err.println("getMessage(): " + e.getMessage());
            System.err.println("getLocalizedMessage(): " + e.getLocalizedMessage());
            System.err.println("toString(): " + e.toString());
            System.err.println("printStackTrace(): ");
            e.printStackTrace();
        }
    }
}
