public class MeteorSwarm extends Spell{
    public MeteorSwarm(int dmg, String dmgType, int manaReq){
        super(dmg,dmgType,manaReq);
        SPELL_TYPE = "meteor swarm";
    }

    public int cast(Character hero, Character enemy){
        int attack = 0;
        if(hero.getMana() >= getManaReq()){
            hero.setMana(hero.getMana() - getManaReq());
            attack += getDmg();
            if(enemy.isWeakTo(getDmgType())){
                attack += (getDmg()/2);

            }
        }
        return attack;
    }
}