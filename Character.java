import java.util.*;
import java.lang.*;
public class Character{
    private int hp,xp,speed,mana;
    private String name;
    private static String CLASS_NAME;
    // private Weapon weapon;
    // private Spell spell;
    private boolean hasWeapon, hasSpell;
    private String weakness;


    public Character(String name, String weakness, int speed){
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

    public int getMana(){
        return mana;
    }

    public void setMana(int mana){
        this.mana = mana;
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

    public void takeDmg(int dmg){
        setHP(getHP()-dmg);
    }

    public boolean isAlive(){
        if(getHP()<=0){
            return false;
        }

        else{
            return true;
        }
    }


    public boolean isWeakTo(String strength){
        if(weakness.equals(strength)){
            return true;
        }
        else{
            return false;
        }
    }

    public String getName(){
        return name;
    }

    public int getSpeed(){
        return speed;
    }

    public void chooseAction(Character target){
        target.takeDmg(5);
        System.out.printf("%s uses the popular masses to harry %s",name,target.getName());
    }

    public String toString(){
        return String.format("%s : %s Level : %d HP : %d",CLASS_NAME,getName(), getLevel(), getHP());
    }


}
