public class Archer extends Protagonist {

    public Archer (String a){
	super(a);
	_dex += 30;
	_defense -= 10;
    }

    double old1 = _rangedattack;
    double old2 = _hitchance;
    int old3 = _defense;

    public void specialize(){

	_rangedattack += .3;
	_hitchance -= .1;
	_defense -= 10;
    }

    public void normalize(){

	_rangedattack = old1;
	_defense = old3;
	_hitchance = old2;
    }

    public String about(){
	return "Archers commonly hail from the dense forests of the land and are often elves. Elves are \n known for their quick reflexes, sharp eyes, and hatred of evil monsters. Archers \n generally deal more damage than melee classes, however can take less punishment \n and dish out less damage (though are more accurate) than their other ranged \n counterparts.";
    }

    public String attacktype(){
	return "ranged";
    }
}
