public class Monkey extends Character{
    private Weapon weapon;

    public Monkey(String name){
        super(name, "Earth", 5);
        CLASS_NAME = "Monkey";
        this.weapon = = new BeeGrenade();

        //String weapon = "Bee Grenade";
        
    }

    public void chooseAction(Character target){
        System.out.println("What do you want to do?");
        System.out.println("1. Throw a Bee Grenade");
        System.out.println("2. Heal");








    }

}