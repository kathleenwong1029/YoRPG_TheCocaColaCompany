//Kathleen Wong , Ben Shapiro, Aidan Griffin
//The CocaCola Company
//APCS1 pd 1
//HW33 -- Ye Olde Role Playing Game, Realized
//2017-11-15

public class Swordsman extends Protagonist {

    public Swordsman (String a){
	super(a);
	_defense += 30;
	_meleeattack -= 0.5;
	_hitchance += 0.2;
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
	return "The Swordsman is a safe bet. He is very accurate with even though he does little damage with it. It was the most important soldier in the success of the Greeks, particularly at the Battle of Marathon. \n This goes without even mentioning its strongest characteristic. It is the Great Wall of China by itself, with fabulous defense. \n So, do you want to choose the conservative and enticing option? \n ";
    }
    public String attacktype(){
	return "melee";
    }
}
