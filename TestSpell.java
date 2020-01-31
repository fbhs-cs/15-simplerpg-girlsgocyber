public class TestSpell{

    public static void testGetDmg(Spell fire){
        System.out.println(fire.getDmg());
    }

    public static void testGetDmgType(Spell fire){
        System.out.println(fire.getDmgType());
    }

    public static void testGetManaReq(Spell fire){
        System.out.println(fire.getManaReq());
    }





    public static void Main(String args[]){
        Spell fire = new Spell(5,"fire",5);
        testGetDmg(fire);
        testGetDmgType(fire);
        testGetManaReq(fire);
    }
}