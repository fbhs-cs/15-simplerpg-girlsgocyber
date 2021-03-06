import java.util.Scanner;

public class Monkey extends Character{
    private Weapon weapon;

    public Monkey(String name){
        super(name, "Earth", 10);
        CLASS_NAME = "Monkey";
        this.weapon = new BeeGrenade();

    }

    public void chooseAction(Character target){
        Scanner options = new Scanner(System.in);
        int choice = 0;
        while(true){
            try{
                System.out.println("What would you like to do? ");
                System.out.println("1. Throw a bee grenade");
                System.out.println("2. Monkey Brain Pause To Look At Pretty Tree (+ 10 HP)");
                System.out.print("> ");
                choice = Integer.parseInt(options.nextLine());
                if(choice != 1 && choice != 2) {
                    System.out.println("You must type in 1 or 2");
                    continue;
                }
                break;
            } 
            catch (Exception e) {
                System.out.println("You must type in 1 or 2");
            }
        }
           

            if(choice==1){
                System.out.println(getName()+" the Monkey throws a bee grenade");
                target.takeDmg(weapon.attack(target));
                
            }
            else{
                System.out.println(getName()+" the Monkey takes a Monkey Brain Pause");
                if((getMaxHP() + 10) > getMaxHP()){
                    setHP(getHP() + 0);
                }
                else{
                    setHP(getHP() + 10);
                }
            }
        
    }



    // public String toString(){
    //     return getName();
    // }


}