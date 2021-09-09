package ex_interface_implements;

public class MainClass {


    public static void move(Vehicle[] vehicles) {
        for (int i = 0; i < vehicles.length; i++)
            vehicles[i].move();
    }

    public static void Payment(Payment[] payment) {
        for (int i = 0; i < payment.length; i++)
            payment[i].Pay();
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Taxi(), new Subway(), new Plane(), new Bus()
        };
        move(vehicles);

        Payment[] payments = new Payment[]{
                new Taxi(), new Subway(), new Plane(), new Bus()
        };
        Payment(payments);

    }
}






















