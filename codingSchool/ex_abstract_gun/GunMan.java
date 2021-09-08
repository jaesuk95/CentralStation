package ex_abstract_gun;

public class GunMan {
    private Gun gun;

    public GunMan(Gun gun) {
        this.gun = gun;
    }

    public void changeGun(Gun gun) {
        this.gun = gun;
    }

    public void reload() {
        gun.reload();
    }

    public void shot() {
        gun.shoot();
    }

    public void aim() {
        gun.aim();
    }

}
