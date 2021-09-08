package ex_object_toString;

public class Student {

    int studentId;
    String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // toString method that replaces memory with sometime valuable
    // replaces the original memory printing with what we want

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name='" + name + '\'' + '}';
    }
}
