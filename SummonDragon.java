public class SummonDragon extends Spell{

    public SummonDragon(){
        super(15, "Fire", 15);
        SPELL_TYPE = "Dragon";
    }

    public int cast (Character offense, Character defense){
        int attack = 0;
        if(offense.getMana() >= getManaReq()){
            offense.setMana(offense.getMana() - getManaReq());
            attack += getDmg();
            if(defense.isWeakTo(getDmgType())){
                attack += (getDmg()/2);
            }
        }
        return attack;
    }

    public String toString(){
        return " summoned a dragon";
    }

    


}