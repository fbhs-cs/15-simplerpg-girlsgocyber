import java.util.Scanner;
public class Foot extends Character{
    private Spell spell;


    public Foot(String name){
        super(name, "Water", 30);
        this.spell = new HeavenlyStompTechnique();
        CLASS_NAME = "Foot";
        setMana(10*getLevel());
    }

    public void chooseAction(Character target){
        Scanner options = new Scanner(System.in);
        int choice = 0;
        while(true){
            try{
        System.out.println("What would you like to do? ");
        System.out.println("1. charge up feet powers (+ 5 mana)");
        System.out.println("2. cast a spell");
        System.out.print("> ");
        choice = Integer.parseInt(options.nextLine());
        if(choice != 1 && choice != 2) {
            System.out.println("You must type in 1 or 2");
            continue;
        }
        
            break;
        

    } catch (Exception e) {
        System.out.println("You must type in 1 or 2");
    }}
 

    if(choice==2){
        System.out.println(getName()+" the Foot casts Heavenly Stomp Technique!");
        target.takeDmg(spell.cast(this,target));
    }
    else{
        takeManaPotion();
        System.out.println(getName()+" the Foot's feet are plugged in.");
    }
}



    public void takeManaPotion(){
        setMana(getMana()+5);
    }

    public String toString(){
        return String.format("%s Level : %d HP : %d MP: %d",getName(), getLevel(), getHP(),getMana());
    }

    


}