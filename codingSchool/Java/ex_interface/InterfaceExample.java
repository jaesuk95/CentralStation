package ex_interface;

public class InterfaceExample implements InterfaceKept {

    public static void main(String[] args) {

        System.out.println(colour);
        InterfaceExample ex = new InterfaceExample();
        ex.fillUp();
    }

    @Override
    public void fillUp() {

        System.out.println("It is what it is");
    }
}
