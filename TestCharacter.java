public class TestCharacter{

    public static int testGetHP(Character c){
        System.out.println(c.getHP());
    }

    public static void testSetHP(Character c){
        c.setHP(10);

    }

    public static void main(String[] args) {
        Character bob = new Character("Bob", "Love", 7);
        testGetHP(bob);
        testSetHP(bob);
        testGetHP(bob);
        

        
        

    }

}
