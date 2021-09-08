package ex_abstract_gun;

public class K2 extends Gun {

    private int bullet;

    public K2(int bullet) {
        super("K2");
        this.bullet = bullet;
    }


    @Override
    public void shoot() {
        if (bullet <= 0) {
            System.out.println("IM OUT OF BULLET SANDWICH");
        } else {
            bullet--;
            System.out.println("OPENFIRE " + bullet);
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

