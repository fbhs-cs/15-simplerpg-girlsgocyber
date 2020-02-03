import java.util.*;
public abstract class Weapon{
    private int dmg;
    private String dmgType;
    private double crit;
    protected static String WEAPON_TYPE;

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
        WEAPON_TYPE = "weapon";
        return WEAPON_TYPE;
    }

    /**
     * returns a string of the weapon and its stats
     * @return a string of stats
     */
    public String toString(){
        return String.format("Weapon: %s, damage: %d, damage type: %s",getWeaponType(),dmg,dmgType);
    }

    /**
     * returns the damage of an attack with the weapon
     * @return damage of the weapons attack
     */
    public abstract int attack(Character enemy);
