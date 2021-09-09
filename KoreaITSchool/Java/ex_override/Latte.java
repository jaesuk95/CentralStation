package ex_override;

public class Latte extends Coffee{

    @Override
    public void taste() {
        System.out.println("Taste of LATTE");
    }

}
