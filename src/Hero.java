public class Hero extends GameEntity{
    private String heroAttacksType ;

    public Hero(int heath, int damage, String heroAttacksType) {
        super(heath, damage);
        this.heroAttacksType = heroAttacksType ;
    }
    public Hero(int health, int damage) {
        super(health, damage);
        this.heroAttacksType = "None" ;
    }

    public String getHeroAttacksType() {
        return heroAttacksType;
    }
}
