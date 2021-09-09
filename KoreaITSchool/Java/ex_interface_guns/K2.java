package ex_interface_guns;

public class K2 implements Gun {

    private int bullet;

    public K2(int bullet) {
        this.bullet = bullet;
    }

    @Override
    public void Shoot() {

        if(bullet <= 0) {
            System.out.println("I am out of bullet");
        } else {
            bullet--;
            System.out.println(bullet + " BANG! OPEN FIRE");
        }
    }

    @Override
    public void Reload() {
        bullet = 30;
        System.out.println("K2 RELOADING");

    }
}
