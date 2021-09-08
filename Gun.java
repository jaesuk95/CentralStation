package ex_abstract_gun;

public abstract class Gun {

    private String gunName;

    public Gun(String gunName) {
        this.gunName = gunName;
    }

    public abstract void shoot();
    public abstract void reload();
    public abstract void aim();
}
