package ex_interface_implements;

import java.util.Random;

public class Plane implements Vehicle, Payment {

    @Override
    public void Pay() {
        Random random = new Random();
        int additionalFee = random.nextInt(1000000);
        System.out.println(PLANE_FEE + additionalFee + " WON PLANE TICKET HAS BEEN CHARGED");

    }

    @Override
    public void move() {
        System.out.println("I am on the plane");

    }
}
