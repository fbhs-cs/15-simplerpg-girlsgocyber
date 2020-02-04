public class PeterSword extends Weapon{
    public PeterSword(int dmg, String dmgType){
        super(dmg,dmgType,.10);
        WEAPON_TYPE = "peters sword";
    }

    public int attack(Character enemy){
        int damage = (int) (Math.random() * getDmg()) + (int) (.5 * getDmg());
        if(enemy.isWeakTo(getDmgType())){
            damage += .5 * damage;
        }
        if(Math.random() < getCrit()){
            damage *= 2;
        }
        return damage;
    }
}