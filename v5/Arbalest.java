public class Arbalest extends Protagonist {

    public Arbalest (String a){
	super(a);
	_dex += 15;
	_defense += 20;
	_hitchance -= .2;
	_rangedattack += .2;

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
	return "The Arbalest is armed with a mighty crossbow and more armor than a standard archer. \n Arbalests are highly trained and drilled members of armies across the land, \n and can strike down foes both for just and evil causes. They do more damage than \n archers but are less accurate, however they are still much more accurate than \n Musketeers.";
    }

    public String attacktype(){
	return "ranged";
    }
}
