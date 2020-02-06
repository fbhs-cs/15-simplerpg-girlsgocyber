public class MilkPail extends Weapon{
    public MilkPail(){
        super(8,"Water",.13);
        WEAPON_TYPE = "Milk Pail";
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
        return " swung their Milk Pail";
    } 
    }
