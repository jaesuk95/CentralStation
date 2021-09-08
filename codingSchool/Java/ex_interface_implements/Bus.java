package ex_interface_implements;

public class Bus implements Vehicle, Payment{
    @Override
    public void move() {
        System.out.println("I am on the bus");
    }

    @Override
    public void Pay() {
        System.out.println(Payment.BUS_FEE + " WON BUS FEE PAYMENT HAS BEEN PROCEEDED");
    }
}
