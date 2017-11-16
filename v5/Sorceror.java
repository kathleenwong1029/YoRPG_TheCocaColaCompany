public class Sorceror extends Protagonist {

    public Sorceror (String a){
	super(a);
	_intel += 40;
	_magicattack += .5;
	_defense -= 20;
	_hitchance -= .4;
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
	return "Sorcerors have lost it. Almost completely. Everywhere a Sorceror goes, something is guarenteed \n to be hit by lightning or explode. Luckily for the world, that something can \n often be an evil monster. Sorcerors deal extreme damage, the most of any class, but are usually too nuts to aim. They miss, a lot, but pity any monster that does feel the wrath of a Sorceror's full on attack.";
    }

    public String attacktype(){
	return "magic";
    }
}
