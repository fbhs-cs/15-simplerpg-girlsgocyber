public class HeavenlyStompTechnique extends Spell{
    public HeavenlyStompTechnique(){
        super(6,"Earth",3);
        SPELL_TYPE = "Heavenly Stomp Technique";
    }

    public int cast(Character offense, Character defense){
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
        return " used Heavenly Stomp Tecnique";
    }
    }
