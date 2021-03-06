public abstract class Spell{
    private int dmg;
    private String dmgType;
    private int manaReq;
    protected static String SPELL_TYPE = "Spell";

    /**
     * 
     * @param dmg
     * @param dmgType
     * @param manaReq
     * 
     * constructs a weapon
     */
    public Spell(int dmg, String dmgType, int manaReq){
        this.dmg = dmg; 
        this.dmgType = dmgType;
        this.manaReq = manaReq;
    }

    /**
     * 
     * @param offense
     * @param defense
     * @return attack
     * 
     * Returns the damage of a spell
     * and checks/subtractsmana from offense 
     * 
     */
    public abstract int cast (Character offense, Character defense);//{
        //     int attack = 0;
        //     if(offense.getMana() >= manaReq){
        //         offense.setMana(offense.getMana() - manaReq);
        //         attack += dmg;
        //         if(defense.isWeakTo(dmgType)){
        //             attack += (dmg/2);

        //         }
        //     }
        //     return attack;
        // }

    /**
     * 
     * @return dmg
     * 
     * Returns the damage of a spell
     */
    public int getDmg(){
        return dmg;
    }

    /**
     * 
     * @return dmgType
     * 
     * returns the damage type of a character
     */
    public String getDmgType(){
        return dmgType;
    }

    /**
     * 
     * @return manaReq
     * 
     * returns the mana requirement of a character
     */
    public int getManaReq(){
        return manaReq;
    }

}
