public class SummonDragon extends Spell{

    public SummonDragon(){
        super(15, "Fire", 15);
        SPELL_TYPE = "Dragon";

    }


    public int cast (Character offense, Character defense){
        int attack = 0;
        if(offense.getMana() >= this.getManaReq()){
            offense.setMana(offense.getMana() - this.getManaReq());
            attack += this.getDmg();
            if(defense.isWeakTo(this.getDmgType())){
                attack += (this.getDmg()/2);

            }
        }

        return attack;
    }

    


}