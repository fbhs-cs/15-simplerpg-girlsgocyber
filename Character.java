import java.util.*;
import java.lang.*;
public abstract class Character{
    private int hp,xp,speed,mana;
    private String name;
    protected static String CLASS_NAME = "Character";
    // private Weapon weapon;
    // private Spell spell;
    // private boolean hasWeapon, hasSpell;
    private String weakness;



    public Character(String name, String weakness, int speed){
        this.name = name;
        this.weakness = weakness;
        this.speed = speed;
        this.xp = 1;
        setHP(getMaxHP());
    }

    
    public int getHP(){
        return hp;
    }

    public int getXP(){
        return xp;
    }

    public void addXP(int more){
        xp+=more;
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

    public int getMaxHP(){
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

    public abstract void chooseAction(Character target);

    public String toString(){
        return String.format("\n%s Level : %d HP : %d",getName(), getLevel(), getHP());
    }


}
