import java.util.Scanner;
public class Foot extends Character{
    private Spell spell;


    public Foot(String name){
        super(name, "fire", 30);
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
        System.out.println("1. drink a mana potion");
        System.out.println("2. cast a spell");
        System.out.print("> ");
        choice = Integer.parseInt(options.nextLine());
        if(choice < 1 || choice > 2) {
            System.out.println("You must type in 1 or 2");
            continue;
        }
        break;

    } catch (Exception e) {
        System.out.println("You must type in 1 or 2");
    }
    options.close();

    if(choice==1){
        target.takeDmg(spell.cast(this,target));
    }
    else{
        takeManaPotion();
    }
}

}

    public void takeManaPotion(){
        setMana(getMana()+5);
    }

    public String toString(){
        return String.format("%s : %s Level : %d HP : %d",CLASS_NAME,getName(), getLevel(), getHP());
    }

    


}