package ex_finally;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = null;

        try {
            sc = new Scanner(System.in);
            System.out.println("Enter your age >>> ");
            int age = sc.nextInt();
            System.out.println("Your age is " + age + ".");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            sc.close();
        }
    }
}
