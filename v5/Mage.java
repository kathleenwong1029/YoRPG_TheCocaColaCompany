public class Mage extends Protagonist {

    public Mage (String a){
	super(a);
	_intel += 20;
	_defense -= 20;
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
	return "Mages hail from countless universities and schools of magic across the land. Generally \n from the noble classes, mages practice a fine art and such tend to be overwhelmingly \n obnoxious. No wonder those monsters want to kill them! Nonetheless, magic is a \n powerful tool on the battlefield and a properly cast spell can completely ignore \n armor. However, mages commonly think they're too good to wear armor \n and such can take less of a beating than melee or ranged classes.";
    }

    public String attacktype(){
	return "magic";
    }
}
	
