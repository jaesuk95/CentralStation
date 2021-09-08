package ex_collection_review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

    private String name;
    private List<Employee> employs; // List = 리스트 인터페이스를 작성 <클래스 입력>
    private Scanner sc;

    public Company(String name) {
        this.name = name;
        employs = new ArrayList<Employee>();
        sc = new Scanner(System.in);
    }

    private void addEmployee() {                // constructor 필요
        System.out.println("=== add employee ===");
        System.out.println("insert your ID");
        long id = sc.nextLong();
        System.out.println("type your name");
        String name = sc.next();
        employs.add(new Employee(name, id));
    }

    private void deleteEmployee() {
        System.out.println("=== delete employee ===");
        System.out.println("id number to delete");
        long id = sc.nextLong();
        for ( Employee employee : employs ) {
            if ( employee.getId() == id ) {
                System.out.println(employee.getName() + " you are fired");
                employs.remove(employee);
                return;
            }
        }
    }

    private void inquiryEmployee() {
        System.out.println("=== search employee ===");
        System.out.println("enter id to search");
        long id = sc.nextLong();
        for (int i = 0; i < employs.size(); i++ ) {     // 사원수를 일단 측정한다.
            if (employs.get(i).getId() == id) {         // 그 사원의 순서(i), 차례를 진행 중간에 아이디를 검색한다.
                System.out.println(employs.get(i));
                return;
            }
        }
    }

    private void inquiryAllEmployee() {             // toString() 필요
        System.out.println("=== search all employee ===");
        if (employs.size() == 0) {
            System.out.println("현재 고용중인 사원은 없습니다.");
            return;
        }
        for ( Employee employee : employs ) {
            System.out.println(employee);
        }
    }

    private void menu() { // 내부에서 사용하는 메소드
        System.out.println("*********");
        System.out.println("1. 사원 추가");
        System.out.println("2. 사원 삭제");
        System.out.println("3. 사원 조회");
        System.out.println("4. 사원 전체 조회");
        System.out.println("0. 종료");
        System.out.println("*********");
    }

    public void employManage () {
        while (true) {
            menu();
            System.out.println("please select 0 to 4 >>>");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: addEmployee();
                break;

                case 2: deleteEmployee();
                break;

                case 3: inquiryEmployee();
                break;

                case 4: inquiryAllEmployee();
                break;

                case 0:
                    System.out.println("Reject");
                    return;
                default:
                    System.out.println("선택 메뉴를 다시 확인하세요");
            }
        }
    }


}
