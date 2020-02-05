import java.util.Scanner;
public class Sorcerer extends Character{
    private Spell spell;
    public Sorcerer(){
        super("Old Guy Sorcerer", "Water", 5);
        this.spell = new SummonDragon();
        CLASS_NAME = "Sorcerer";
        setMana(50);

    }

    public void chooseAction(Character target){

        int choice = 0;
        // Scanner options = new Scanner(System.in);
        // int choice = 0;
        // while(true){
        //     try{
        // System.out.println("What would you like to do? ");
        // System.out.println("1. Summon a Dragon");
        // System.out.println("2. Hydrate Before You Diedrate (+ 10 Mana)");
        // System.out.print("> ");
        // choice = ;
        // if(choice < 1 || choice > 2) {
        //     System.out.println("You must type in 1 or 2");
        //     continue;
        // }
        // break;

        // } catch (Exception e) {
        //     System.out.println("You must type in 1 or 2");
        // }
        // options.close();

        if(choice==1){
            target.takeDmg(spell.cast(this,target));
        }
        else{
            takeManaPotion();
        }
    }

    public void takeManaPotion(){
        setMana(getMana() + 10);
    }

}