public class TestCharacter{

    public static void testIsWeakTo(Character c){
        
    }

    public static void testGetHP(Character c){
        System.out.println(c.getHP());
    }

    public static void testSetHP(Character c){
        c.setHP(10);

    }

    public static void testAddXP(Character c){

    }

    public static void testGetXP(Character c){

    }


    public static void testSetLevel(Character c){
        c.setLevel(9001);
    }

    public static void testGetLevel(Character c){
        System.out.println(c.getLevel());
    }

    public static void main(String[] args) {
        Character bob = new Character("Bob", "Love", 7);
        testGetHP(bob);
        testSetHP(bob);
        testGetHP(bob);
        testSetHP(bob);
        testGetLevel(bob);
        

        
        

    }

}
