package ex_abstract_gun;

public class MainClass {

    public static void main(String[] args) {

        GunMan gunman = new GunMan(null);
        K2 k2 = new K2(30);
        gunman.changeGun(k2);

        for (int i=0; i<32; i++)
            gunman.shot();
        gunman.reload();
        gunman.aim();

        gunman.changeGun(new AK47(30));

        for (int i=0; i<32; i++)
            gunman.shot();

    }
}
