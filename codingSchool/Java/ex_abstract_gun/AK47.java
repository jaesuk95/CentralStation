package ex_abstract_gun;

public class AK47 extends Gun {

    private int bullet;

    public AK47(int bullet) {
        super("AK47");
        this.bullet = bullet;
    }

    @Override
    public void shoot() {
        if (bullet <= 0) {
            System.out.println("IM OUT OF BULLET");
        } else {
            bullet--;
            System.out.println("OPEN FIRE " + bullet);
        }
    }

    @Override
    public void reload() {
        bullet = 30;
        System.out.println("AK47 RELOADING");
    }

    @Override
    public void aim() {
        System.out.println("CROSSHAIR AIM");
    }
}

