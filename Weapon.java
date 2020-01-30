import java.util.*;
public class Weapon{
    private int dmg;
    private String dmgType;
    private double crit;
    private String WEAPON_TYPE;

    public Weapon(int dmg, String dmgType, double crit){
        this.dmg = dmg;
        this.dmgType = dmgType;
        this.crit = .10;
    }

    public int getDmg(){
        return this.dmg;
    }

    public double getCrit(){
        return this.crit;
    }

    public String getDmgType(){
        return this.dmgType;
    }

    public String getWeaponType(){
        return this.WEAPON_TYPE;
    }

    public String to_String(){
        return String.format("Weapon: %s, damage: %d, damage type: %s",WEAPON_TYPE,dmg,dmgType);
    }
    public int attack(Character enemy){
        int damage = (int) (Math.random() * dmg) + (int) (.5 * dmg);
        if(enemy.isWeakTo(dmgType)){
            damage += .5 * damage;
        }
        if(Math.random() < getCrit()){
            damage *= 2;
        }
        return damage;
    }
}
