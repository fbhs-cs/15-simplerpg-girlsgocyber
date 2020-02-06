public class BeeGrenade extends Weapon{

    public BeeGrenade(){
        super(10, "Earth", 0.1);
        WEAPON_TYPE = "Bee grenade";
    }

    public int attack(Character enemy){
        int attack = (int) (Math.random() * getDmg()) + (int) (.5 * getDmg());
        if(enemy.isWeakTo(getDmgType())){
            attack += (getDmg() / 2);
        }
        if(Math.random() < getCrit()){
            attack *= 2;
        }
        return attack;
    }

    public String toString(){
        return " threw a bee grenade";
    }

}