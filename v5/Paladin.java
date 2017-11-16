//Kathleen Wong , Ben Shapiro, Aidan Griffin
//The CocaCola Company
//APCS1 pd 1
//HW32-- Ye Olde Role Playing Game, UNCHAINED
//2017-11-14

public class Paladin extends Protagonist {

    public Paladin (String a){
	super(a);
	_defense += 30;
	_strength -= 20;
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
	return "The Paladin is an intimidating figure, clad in thick armor ardorned with countless crests and parchments, and more importantly equipped typically with a massive, battle-scarred shield. \n Paladins are men and women in service of the \n Church of Light, a widespread faith that many loyally cling to when desperate times come \n Paladins excell at protecting others, taking hits, and fending off the mightiest of blows, from the most \n fearsome of monsters. However, typically, their armaments are then inferior to those more focused around \n dealing damage, like Warriors and Assassins.";
    }

    public String attacktype(){
	return "melee";
    }
}
