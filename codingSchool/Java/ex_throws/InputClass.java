package ex_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputClass {

    private Scanner sc = new Scanner(System.in);

    public int inputAge() throws InputMismatchException, RuntimeException {
        System.out.println("나이를 입력하세요 >>> ");
        int age = sc.nextInt();
        if (age < 0 || age > 100) {
            throw new RuntimeException("you fokin lying age");
        }
        return age;
    }
}