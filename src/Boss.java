public class Boss extends GameEntity {
private Weapon weapon;

public Boss(int health, int damage, Weapon weapon) {
    super(health, damage);
    this.weapon = weapon ;
}

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void printInfo() {
        System.out.println(" Boss info : ");
        System.out.println(" Heath : " + getHealth());
        System.out.println("Damage : " + getDamage());
        System.out.println("Defense Type :" + getWeapon());
    }
}
