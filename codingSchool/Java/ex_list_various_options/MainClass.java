package ex_list_various_options;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {

    public static void m1() {
        List<String> names = new ArrayList<String>();   // "new" is always used to create new object. It creates a new instance
        // object is being explicitly created for the first time.
        names.add("A1");
        names.add("A2");
        names.add("A3");
        names.add("A4");
        System.out.println(names);
    }


    public static void m2() {
        List<String> names2 = Arrays.asList("B1", "B2", "B3", "B4"); // "new" is used to get an existing object which is already allocated
                                                                    // in this case, you retrieve an already created one
    // fetching an object using a getter method new is not required because the object already exists in memory, thus does not need to be recreated

        System.out.println(names2);
        System.out.println(names2.size());
    }

    public static void m3() {
        List<String> names3 = Arrays.asList("C1", "C2", "C3", "C4");

        for (int i = 0; i < names3.size(); i++) {
            System.out.println(names3.get(i));
        }

        for ( String name : names3 ) {
            System.out.println(name);
        }
    }

    public static void m4() {

        List<Person> staffs = new ArrayList<Person>();

        staffs.add(new Person());
        staffs.add(new Person());
        staffs.add(new Person());
        staffs.add(new Person());

        String[] names = {"D1", "D2", "D3", "D4"};
        int[] ages = {10,20,30,40};

        for (int i = 0; i < staffs.size(); i++) {
            staffs.get(i).setName(names[i]);
            staffs.get(i).setAge(ages[i]);
            System.out.println(staffs);
        }

        for ( Person staff : staffs ) {
            System.out.println("이름: " + staff.getName() + ", 나이: " + staff.getAge());
        }

    }

    public static void m5() {
        List<Integer> lotto = new ArrayList<Integer>();

        lotto.add(2);
        lotto.add(3);

        System.out.println(lotto);
    }



    public static void main(String[] args) {
        m1();
        m2();
        m3();
        m4();
        m5();
    }

}
