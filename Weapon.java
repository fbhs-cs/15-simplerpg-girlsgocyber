import java.util.*;
public class Weapon{
    private int dmg;
    private String dmgType;
    private double crit;
    private String WEAPON_TYPE;

    public Weapon(int dmg, String dmgType, double crit){
        this.dmg = dmg;
        this.dmgType = dmgType;
        this.crit = 2.0;
    }

    public int getDmg(){
        return this.dmg;
    }

    public double crit(){
        return this.crit;
    }
    public int attack(Character enemy){
        int damage = (int) (Math.random() * dmg) + (int) (.5 * dmg);
        if(enemy.isWeakTo(dmgType)){
            damage += .5 * damage;
        }
    }
}
