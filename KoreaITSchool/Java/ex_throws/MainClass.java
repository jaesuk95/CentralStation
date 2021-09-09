package ex_throws;

public class MainClass {

    public static void main(String[] args) {

        InputClass i = new InputClass();

        int age = 0;

        try {
            age = i.inputAge();
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("your age is " + age);
    }
}
