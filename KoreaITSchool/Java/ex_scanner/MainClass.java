package ex_scanner;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나이 : ");
        int age = sc.nextInt();
        System.out.println("당신의 나이는 " + age + "입니다");

        System.out.println("이름 입력 : ");
        String name = sc.next();
        System.out.println("너의 이름은 " + name );
    }


}
