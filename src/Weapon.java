public class Weapon {
    private TypeEnum weapon ;
private String name ;
public Weapon(TypeEnum weapon,String name) {
    this.weapon = weapon ;
    this.name = name ;
}

    public TypeEnum getWeapon() {
        return weapon;
    }

    public String getName() {
        return name;
    }

    public void setWeapon(TypeEnum weapon) {
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
    return "Weapon{" + "weapon =" + weapon + " , name=" +  '\'' +'}' ;

    }
}
