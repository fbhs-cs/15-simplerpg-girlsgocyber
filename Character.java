import java.util.*;
import java.lang.*;
public class Character{
    private int hp,xp,speed;
    private String name;
    private String CLASS_NAME;
    // private Weapon weapon;
    // private Spell spell;
    private boolean hasWeapon, hasSpell;
    private String weakness;

    public Character(String name, String[] weakness, int speed){
        this.name = name;
        this.weakness = weakness;
        this.speed = speed;
    }
    
    public int getHP(){
        return hp;
    }

    public int getXP(){
        return xp;
    }

    public void setHP(int hp){
        this.hp = hp;
    }

    public void setLevel(int lvl){
        this.xp = lvl*lvl;
    }

    public int getLevel(){
        return (int) Math.sqrt((double)xp);
    }

    private int getMaxHP(){
        return this.getLevel()*12;
    }

    public String getName(){
        return name;
    }

    public void attack(Character target){
        System.out.print("I bite my thumb at you");
    }


}
