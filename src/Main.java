public class Main {
    public static void main(String[] args) {

        Weapon bossWeapon = new Weapon(TypeEnum.FIRE_WEAPON, "UMP");
        Weapon skeletonWeapon1 = new Weapon(TypeEnum.TOY_WEAPON, "Shots water");
        Weapon skeletonWeapon2 = new Weapon(TypeEnum.TOY_WEAPON, "Shoots water");
        Boss boss = new Boss(450, 50, bossWeapon);

        boss.printInfo();


        Skeleton skeleton1 = new Skeleton(250, 35, skeletonWeapon1, 5);
        Skeleton skeleton2 = new Skeleton(230, 30, skeletonWeapon2, 4);
        skeleton1.printInfo();
        skeleton1.printInfo();


        Hero[] heroes = createHeroes();
        System.out.println("\nHeroes Info :");
        for (Hero hero : heroes) {
            System.out.println("Health :" + hero.getHealth() + " , Damage : " + hero.getDamage() +
                    " , Attacks Type :" + hero.getHeroAttacksType());
        }
    }

    public static Hero[] createHeroes() {
Hero hero1 = new Hero(190, 25, "Physical") ;
Hero hero2 = new Hero(140,20) ;
Hero hero3 = new Hero(170,15,"Kinetic") ;


Hero[] heroes = {hero1,hero2,hero3} ;
return heroes ;
    }

}