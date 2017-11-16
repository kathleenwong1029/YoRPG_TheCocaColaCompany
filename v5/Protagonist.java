//Kathleen Wong , Ben Shapiro, Aidan Griffin
//The CocaCola Company
//APCS1 pd 1
//HW32-- Ye Olde Role Playing Game, Expanded
//2017-11-14

public abstract class Protagonist extends Character
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected String _name = "J. Doe";
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    public Protagonist()
    {
	_hitPts = 150;
	_strength = (int)(Math.random() * 80) + 20;
	_defense = (int)(Math.random() * 40) + 20;
	_dex = (int)(Math.random() * 80) + 20;
	_intel = (int)(Math.random() * 80) + 20;
	_meleeattack = .5;
	_rangedattack = .5;
	_magicattack = .5;
	_hitchance = .7;
    }


    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    public Protagonist( String name ) {
	this();
	_name = name;
    }


    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() { return _name; }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    /*=============================================
      int attack(Monster) -- simulates attack on instance of class Monster
      pre:  Input not null
      post: Calculates damage to be inflicted, flooring at 0. 
      Calls opponent's lowerHP() method to inflict damage. 
      Returns damage dealt.
      =============================================*/
    public int attack( Monster opponent )
    {
	int damage = 0;
	if (attacktype().equals("melee")){
	    damage = (int)( (_strength * _meleeattack) - opponent.getDefense() );
	}
	if (attacktype().equals("ranged")){
	    damage = (int)( (_dex * _rangedattack) - (opponent.getDefense() / 2));
	}
	if (attacktype().equals("magic")){
	    damage = (int)( (_intel * _magicattack));
	}

	if ( damage < 0 )
	    damage = 0;

	opponent.lowerHP( damage );

	return damage;
    }//end attack

    public boolean hitchance (){
	return (Math.random() <= _hitchance);
    }
	   

    public abstract String about();

    public abstract void specialize();

    public abstract void normalize();

    public abstract String attacktype();

}//end class Protagonist
