package ex_object_toString;

public class MainClass {

    public static void main(String[] args) {

        Car car = new Car("Model Y", "Tesla");
        System.out.println(car);



        Student student = new Student(1, "Bruce");
        Student student2 = new Student(2, "Jackie");

        System.out.println(student);
        System.out.println(student2);
        // toString method that replaces memory with sometime valuable
        // replaces the original memory printing with what we want
    }
}
