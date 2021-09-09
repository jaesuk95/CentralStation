package ex_interface_implements;

import java.util.Random;

public class Taxi implements Vehicle, Payment{
    @Override
    public void move() {
        System.out.println("I am on Taxi");
    }

    @Override
    public void Pay() {
        Random random = new Random();
        int additionalFee = random.nextInt(30000);
        System.out.println(Payment.TAXI_FEE + additionalFee + " WON TAXI FEE HAS BEEN PROCEEDED");
    }
}
