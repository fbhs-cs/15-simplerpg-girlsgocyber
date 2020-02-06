public class Winnie extends Character{
    private Spell spell;

    public Winnie(){
        super("Winnie the pig", "Slashing", 55);
        CLASS_NAME = "Winnie the pig";
        this.spell = new MeteorSwarm();
    }

    public void chooseAction(Character enemy){
        int choice = (int)(Math.random()*2)+1;
        if(choice==2){
            enemy.takeDmg(spell.cast(this,enemy));
        }
        else{
            setHP(getMaxHP() + 5);
        }
    }

}