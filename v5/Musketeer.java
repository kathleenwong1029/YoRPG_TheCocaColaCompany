public class Musketeer extends Protagonist {

    public Musketeer (String a){
	super(a);
	_defense -= 10;
	_rangedattack += .5;
        _hitchance -= .3;
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
	return "Musketeers wield large, loud, terrifying muskets, which can easily blast through the \n toughest of foes. They are found in small numbers in some of the more modern \n armies of the land yet can easily turn the tide of any battle. Muskets are a \n new technology, however, and are both hard to wield and are embarassingly inaccurate. \n  They can rip through armor, provided one can actually aim these things. \n Good luck with that.";
    }

    public String attacktype(){
	return "ranged";
    }
}
