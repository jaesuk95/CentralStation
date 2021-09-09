package ex_catch;

public class MainClass {

    public static void m1() {

        try {
            System.out.println(4/0);
        } catch (Exception e) {
            System.out.println("발생한 예외 메시지: " + e.getMessage());    // Informs of what is the issue
        }
    }

    public static void m2() {

        try {
            String name = null;
            name.equals(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        m1();
        m2();
    }

}
