import java.util.Scanner;
public class Andres extends Character{
    private Weapon weapon;

    public Andres(String name){
        super(name,"Fire",25);
        CLASS_NAME = "Andres";
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
        }
           

            if(choice==2){

                enemy.takeDmg(weapon.attack(enemy));
                System.out.print(getName()+" the Andres attacks with Peter's Sword!");
            }
            else{
                System.out.println(getName()+" the Andres is feeling his new perm!");
                if((getMaxHP() + 5) > getMaxHP()){
                    setHP(getHP() + 0);
                }
                else{
                    setHP(getHP() + 5);
                }
            }
        }
    }
