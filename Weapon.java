import java.util.*;
public class Weapon{
    private int dmg;
    private String dmgType;
    private double crit;
    private String WeaponType;

    /**
     * @param dmg - the damage of the weapon
     * @param dmgType - the damage type of the weapon
     * @param crit - the crit chance of the weapon
     * constructs a weapon 
     */
    public Weapon(int dmg, String dmgType, double crit){
        this.dmg = dmg;
        this.dmgType = dmgType;
        this.crit = crit;
    }

    /**
     * returns the damage of the weapon
     * @return damage
     */
    public int getDmg(){
        return this.dmg;
    }

    /**
     * returns the chance of a crit
     * @return crit
     */
    public double getCrit(){
        return this.crit;
    }

    /**
     * returns the type of damage of the weapon
     * @return damage type
     */
    public String getDmgType(){
        return this.dmgType;
    }

    /**
     * returns the name of the weapon
     * @return name of wepaon
     */
    public String getWeaponType(){
        return this.WeaponType;
    }

    /**
     * returns a string of the weapon and its stats
     * @return a string of stats
     */
    public String toString(){
        return String.format("Weapon: %s, damage: %d, damage type: %s",WeaponType,dmg,dmgType);
    }

    /**
     * returns the damage of an attack with the weapon
     * @return damage of the weapons attack
     */
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
