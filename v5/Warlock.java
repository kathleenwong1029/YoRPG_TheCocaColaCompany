public class Warlock extends Protagonist {

    public Warlock (String a){
	super(a);
	_intel += 30;
	_magicattack += .2;
	_defense -= 20;
	_hitchance -= .2;
    }

    double old1 = _magicattack;
    double old2 = _hitchance;
    int old3 = _defense;

    public void specialize(){

	_magicattack += .5;
	_hitchance -= .2;
	_defense -= 20;
	
    }

    public void normalize(){

	_magicattack = old1;
	_hitchance = old2;
	_defense = old3;

    }

    public String about(){
	return "Warlocks are mages who specialize in the destructive arts, making their attacks significantly \n more deadly and their insurance bills significantly higher. A true warlock has \n burned down his or her house at least once. The more powerful spells that warlocks \n wield do more damage than other attacks, but are notably harder to both conjure \n and aim. The Warlock is a powerful class, but please - don't set your \n hair on fire.";
    }

    public String attacktype(){
	return "magic";
    }
}
