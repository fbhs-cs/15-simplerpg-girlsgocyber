public class TestCharacter{

    public static void main(String[] args) {
        Character bob = new Character("Bob", "Love", 7);
        bob.setHP(1000);
        bob.setLevel(123);
        bob.setMana(50);
        // bob.addXP(5); DOESN'T WORK
        
        System.out.println(bob.toString());
        System.out.println();
        System.out.println("Name: " + bob.getName());
        System.out.println("Level: " + bob.getLevel());
        System.out.println("Test Weakness: " + bob.isWeakTo("Love")); 
        System.out.println("Health: " + bob.getHP());
        System.out.println("XP: " + bob.getXP());
        System.out.println("Get Speed: " + bob.getSpeed());
        bob.takeDmg(500);
        System.out.println("Take 500 dmg: " + bob.getHP());
        System.out.println("Alive? " + bob.isAlive());
        System.out.println("Mana: " + bob.getMana());
        bob.takeDmg(500);
        System.out.println("Take 500 dmg: " + bob.getHP());
        System.out.println("Alive? " + bob.isAlive());
        

        

    }

}
