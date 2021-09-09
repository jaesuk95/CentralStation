package ex_set_hashSet;

import java.util.*;

public class MainClass {
//  A "Set" is a collection that cannot contain duplicate elements. // HashSet 와 HastMap 차이점은, HashSet 은 input 이 하나
//  In Java, a list interface is an ordered collection of objects in which duplicate values can be stored

//  ArrayList   중복 가능   순서 있음
//  HashSet     중복 불가능  순서 없음

//  Difference between HashSet and Set
//  HashSet 는 자바에서 Set Interface 의 구현(appearing in a concrete form)하는 클래스 입니다.

//  HastSet class is used to create a collection that uses a hast table for storage.
    public static void m1() {
        Set<String> books = new HashSet<String>();
//      hastSet 는 순서와 중복 없이 여러 객체를 저장할 수 있는 컬렉션
        books.add("Book1");
        books.add("Book2");
        books.add("Book3");
        books.add("Book4");
        books.add("Book5");
        books.add("Book5");
        books.add("Book5");

        System.out.println(books);
        System.out.println(books.size());
    }

    public static void m2() {
        Set<String> subjects = new HashSet<String>(Arrays.asList("BookB", "BookA", "BookB","BookC"));

        System.out.println(subjects);
        System.out.println(subjects.size());

        for ( String subject : subjects ) {
            System.out.println(subject);
        }
    }

    public static void m3() {
        Set<Integer> temp = new HashSet<Integer>();

        while (temp.size() < 6) {
            temp.add((int)(Math.random()*45)+1);
        }

        List<Integer> random = new ArrayList<Integer>(temp);

        System.out.println(temp);
        System.out.println(random);
    }

    public static void main(String[] args) {
        m1();
        m2();
        m3();
    }
}
