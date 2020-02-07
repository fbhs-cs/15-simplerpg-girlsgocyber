public class Winnie extends Character{
    private Spell spell;

    public Winnie(){
        super("Winnie", "Slashing", 55);
        CLASS_NAME = "Winnie the pig";
        this.spell = new MeteorSwarm();
    }

    public void chooseAction(Character enemy){
        int choice = (int)(Math.random()*2)+1;
        if(choice==2){
            enemy.takeDmg(spell.cast(this,enemy));
            System.out.println("Winnie casts Meteor Swarm!");
        }
        else{
            System.out.println("Winnie drinks an hp potion!");
            if((getHP() + 5) > getMaxHP()){
                setHP(getHP() + 0);
            }
            else{
                setHP(getHP() + 5);
            }
        }
    }

}