public class TestWeapon{

    // public static void testAttack(){


    //     foot.attack(bob);
    //     System.out
    // }

    public static void testGetDmg(){
        Weapon foot = new Weapon(3,"Love", .10);
        Character bob = new Character("Bob","Love",7);
        foot.attack(bob);
    }
    public static void testAttack(){
        Weapon foot = new Weapon(3,"Love", .10);
        Character bob = new Character("Bob","Love",7);
        foot.attack(bob);
    }
    
    public static void main(String[] args){
        Weapon foot = new Weapon(3,"Love", .10);
        Character bob = new Character("Bob","Love",7);
        System.out.println("Dmg from attack is:"+foot.attack(bob));
        System.out.println("weapon type is: " +foot.getWeaponType());
        System.out.println("dmg type is: "+foot.getDmgType());
        System.out.println("dmg is: "+foot.getDmg());
        System.out.println("crit : "+foot.getCrit());
        System.out.print(foot);
    }
}