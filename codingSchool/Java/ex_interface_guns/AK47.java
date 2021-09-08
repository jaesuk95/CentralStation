package ex_interface_guns;

public class AK47 implements Gun{

    private int bullet;

    public AK47(int bullet) {
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
        System.out.println("AK47 RELOADING");

    }
}

