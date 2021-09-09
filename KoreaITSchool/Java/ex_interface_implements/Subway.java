package ex_interface_implements;

public class Subway implements Vehicle, Payment{
    @Override
    public void move() {
        System.out.println("I am on the train");
    }

    @Override
    public void Pay() {
        System.out.println(Payment.SUBWAY_FEE + " WON SUBWAY FEE HAS BEEN PROCEEDED");
    }
}
