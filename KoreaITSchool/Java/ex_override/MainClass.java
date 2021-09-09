package ex_override;

public class MainClass {
    public static void main(String[] args) {

        Latte latte = new Latte();
        latte.taste();

        Coffee coffee = new Coffee();
        coffee.taste();

    }
}
