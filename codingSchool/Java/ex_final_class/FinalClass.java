package ex_final_class;

final public class FinalClass {

    final int a = 50;
    double b = 100.0;

    void changeB (int newB) {
        b = newB;
    }
    // you can change the value of B, however not 'A' due to final agreement

    // final class is simply a class that cannot be extended.
    // cannot change variables, it is done
}
