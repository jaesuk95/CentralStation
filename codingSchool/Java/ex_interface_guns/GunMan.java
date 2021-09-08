package ex_interface_guns;

public class GunMan {
    private Gun gun;


    public GunMan(Gun gun) {
        this.gun = gun;
    }

    public void changeGun(Gun gun) {
        this.gun = gun;
    }




    public void reload() {
        gun.Reload();
    }

    public void shot() {
        gun.Shoot();
    }

}
