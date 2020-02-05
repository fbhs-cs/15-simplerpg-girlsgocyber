import java.util.Scanner;
public class Andres extends Character{
    private Weapon weapon;

    public Andres(){
        super("Andres","Fire",25);
        CLASS_NAME = "andres";
        this.weapon = new PeterSword();
    }

    public void chooseAction(Character enemy){
        Scanner options = new Scanner(System.in);
        int choice = 0;
        while(true){
            try{
                System.out.println("What would you like to do? ");
                System.out.println("1. Get a perm (+5 health)");
                System.out.println("2. attack with your weapon");
                System.out.print("> ");
                choice = Integer.parseInt(options.nextLine());
                if(choice < 1 || choice > 2) {
                    System.out.println("You must type in 1 or 2");
                    continue;
                }
                break;

            } 
            catch (Exception e) {
                System.out.println("You must type in 1 or 2");
            }
            options.close();

            if(choice==2){
                enemy.takeDmg(weapon.attack(enemy));
            }
            else{
                setHP(getMaxHP() + 5);
            }
        }
    }
}