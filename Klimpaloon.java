import java.util.Scanner;
public class Klimpaloon extends Character{
    private Weapon weapon;


    public Klimpaloon(){
        super("Klimpy", "fire", 25);
        this.weapon = new MilkPail();
        CLASS_NAME = "Klimpaloon, the Magical Old-Timey Bathing Suit";
        
    }

    public void chooseAction(Character target){
        Scanner options = new Scanner(System.in);
        int choice = 0;
        while(true){
            try{
        System.out.println("What would you like to do? ");
        System.out.println("1. Attack with ----");
        System.out.println("2. Taunt");
        System.out.print("> ");
        choice = Integer.parseInt(options.nextLine());
        if(choice == 1 || choice == 2) {
            System.out.println("You must type in 1 or 2");
            continue;
        }
        break;

    } catch (Exception e) {
        System.out.println("You must type in 1 or 2");
    }
    options.close();

    if(choice==1){
        weapon.attack(target);
    }
    else{
        taunt();
    }
}

}

    public void taunt(){
        System.out.println("NANG NANG NANG");
    }

    public String toString(){
        return String.format("%s : %s Level : %d HP : %d",CLASS_NAME,getName(), getLevel(), getHP());
    }

    


}