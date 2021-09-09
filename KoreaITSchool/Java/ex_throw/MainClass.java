package ex_throw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc = null;
        try {
            sc = new Scanner(System.in);                    // scan in function activated
            System.out.println("Enter your age >>> ");      // prints message

            int age = sc.nextInt();
            if (age < 1 || age > 100) {                     // 하나라도 조건이 맞으면, RUNTIME EXCEPTION 으로 실행, 두개 다 틀리면 printLine
                throw new RuntimeException();               // 확인 되지않은 컨디션 throw
            }                                               // throw = throw is used to declare exceptions that can occur during the
                                                            // execution of a program.
            System.out.println("your age is " + age + ".");

        } catch (InputMismatchException e) {
            System.out.println("bro");
        } catch (RuntimeException e) {
            System.out.println("BRO NO");
        } finally {
            sc.close();
        }
    }
}
