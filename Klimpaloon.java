//import java.util.Scanner;
public class Klimpaloon extends Character{
    private Weapon weapon;


    public Klimpaloon(){
        super("Klimpy", "fire", 25);
        this.weapon = new MilkPail();
        CLASS_NAME = "Klimpaloon";
        
    }

    public void chooseAction(Character target){
//         Scanner options = new Scanner(System.in);
        int choice = (int)(Math.random()*2)+1;
//         while(true){
//             try{
//         System.out.println("What would you like to do? ");
//         System.out.println("1. Attack with ----");
//         System.out.println("2. Taunt");
//         System.out.print("> ");
//         choice = Integer.parseInt(options.nextLine());
//         if(choice == 1 || choice == 2) {
//             System.out.println("You must type in 1 or 2");
//             continue;
//         }
//         break;

//     } catch (Exception e) {
//         System.out.println("You must type in 1 or 2");
//     }
//     options.close();

    if(choice==1){
        target.takeDmg(weapon.attack(target));
        System.out.println("Klimpaloon wields his Milk Pail!");
    }
    else{
        System.out.println("Klimpaloon taunts!");
        taunt();
    }
}



    public void taunt(){
        System.out.println("NANG NANG NANG");
    }

    public String toString(){
        return String.format("%10s Level : %3d HP : %3d",CLASS_NAME, getLevel(), getHP());
    }

    


}
