//import java.util.Scanner;
public class Sorcerer extends Character{
    private Spell spell;
    public Sorcerer(){
        super("Old Guy Sorcerer", "Water", 5);
        this.spell = new SummonDragon();
        CLASS_NAME = "Sorcerer";
        setMana(50);

    }

    public void chooseAction(Character target){

        int choice = (int)(Math.random()*2)+1;

        if(choice==1){
            target.takeDmg(spell.cast(this,target));
            System.out.println("Old Guy Sorcerer summons a dragon to attack!");

        }
        else{
            System.out.println("Old Guy Sorcerer has chosen to hydrate before he diedrates! /n +10 Mana");
            takeManaPotion();
        }
    }

    public void takeManaPotion(){
        setMana(getMana() + 10);
    }

}
