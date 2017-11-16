//Kathleen Wong , Ben Shapiro, Aidan Griffin
//The CocaCola Company
//APCS1 pd 1
//HW31-- Ye Olde Role Playing Game, Expanded
//2017-11-14

public class Assassin extends Protagonist {

    public Assassin (String a){
	super(a);
	
        _meleeattack += 0.5;
	_hitPts -= 25;
	_hitchance += 0.2;
	_defense -= 20;
    }

    double old1 = _meleeattack;
    double old2 = _hitchance;
    int old3 = _defense;
    
    
  public void specialize()
  {
    _meleeattack += .5;
    _hitchance -= .3;
    _defense -= 20;
}

    public void normalize()
  {
      _meleeattack = old1;
    _hitchance = old2;
    _defense = old3;
}

    public String about(){

	return "The Assassin lives a life in the shadows, waiting and stalking their pray \n until just the right moment to go in for the kill and strike. And just as quickly as they appear, they \n vanish - such is the way of the silent killer. Trained by the Order of Darkness, \n an organization as mysterious as it is deadly, Assassins do their work clean and well.\n However, even the best Assassin is not prepared to be caught \n out in the open - they trade endurance for significant attack power.";
    }

    public String attacktype(){
	return "melee";
    }

}
