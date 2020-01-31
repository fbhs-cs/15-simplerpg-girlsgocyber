public class TestCharacter{

    // public static void testIsWeakTo(Character c){
        
    // }

    // public static void testAddXP(Character c){

    // }

    // public static void testGetXP(Character c){

    // }


    // public static void testSetLevel(Character c){
    //     c.setLevel(9001);
    // }

    // public static void testGetLevel(Character c){
    //     System.out.println(c.getLevel());
    // }

    public static void main(String[] args) {
        Character bob = new Character("Bob", "Love", 7);
        bob.setHP(1000);
        bob.setLevel(123);
        // bob.addXP(5); DOESN'T WORK
        

        System.out.println("Level: " + bob.getLevel());
        System.out.println("Test Weakness: " + bob.isWeakTo("Love")); 
        System.out.println("Health: " + bob.getHP());
        System.out.println("XP: " + bob.getXP());
        

        
        

    }

}
