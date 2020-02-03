public class Foot extends Character{
    private Spell spell;


    public Foot(String name, Spell spell){
        super(name, "fire", 30);
        this.spell = spell;
        CLASS_NAME = "Foot";
    }

    public void chooseAction(Character target){
        target.takeDmg(spell.cast(this,target));
    }

    public void takeManaPotion(){
        setMana(getMana()+10);
    }

    


}