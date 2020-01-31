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
        foot.attack(bob);
        foot.getWeaponType();
        foot.getDmgType();
        foot.getDmg();
        foot.getCrit();
        System.out.print(foot);
    }
}