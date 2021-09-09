package ex_object_toString;

public class Car {          // Car 는 클래스

    private String name;
    private String maker;

    // constructor      purpose of constructor is to initialise the data fields of objects in the class
    public Car(String name, String maker) {
        this.name = name;   // LHS this.name is set the one at the top
        this.maker = maker; // RHS name, maker is equal to parameter
    }

    // Generate toString

    // The purpose of toString() in Java is,
    // if we want to represent an object of a class, then we can use the toString() method
    // which returns a textual representation of the object.

    // A toString() is an in-built method in java that returns the value given to it in string format.
    // Hence, any object that this method is applied on, will then be returned as a string object.

    // toString() replaces memory location to string information

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maker='" + maker + '\'' +
                '}';
    }
}
