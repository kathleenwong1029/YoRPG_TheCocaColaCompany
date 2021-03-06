//Kathleen Wong,Ben Shapiro, Aidan Griffin
//The CocaCola Company
//APCS1 pd1
//HW31 -- Ye Olde Role Playing Game, Expanded .
//2017-11-14

/**********************************************
 * class YoRPG -- Driver file for Ye Olde Role Playing Game.
 * Simulates monster encounters of a wandering adventurer.
 * Required classes: Protagonist, Monster
 **********************************************/


import java.io.*;
import java.util.*;

public class YoRPG
{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    //change this constant to set number of encounters in a game
    public final static int MAX_ENCOUNTERS = 5;

    //each round, a Protagonist and a Monster will be instantiated...
    private Protagonist pat;   //Is it man or woman?
    private Monster smaug; //Friendly generic monster name?

    private int moveCount;
    private boolean gameOver;
    private int difficulty;
    private String classselect;

    private InputStreamReader isr;
    private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
    public YoRPG()
    {
	moveCount = 0;
	gameOver = false;
	isr = new InputStreamReader( System.in );
	in = new BufferedReader( isr );
	newGame();
    }
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

    /*=============================================
      void newGame() -- gathers info to begin a new game
      pre:  
      post: according to user input, modifies instance var for difficulty 
      and instantiates a Protagonist
      =============================================*/
    public void newGame()
    {
	String s;
	String name = "";
	s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

	s += "\nChoose your difficulty: \n";
	s += "\t1: Easy\n";
	s += "\t2: Not so easy\n";
	s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
	s += "Selection: ";
	System.out.print( s );

	try {
	    difficulty = Integer.parseInt( in.readLine() );
	}
	catch ( IOException e ) { }

	s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
	System.out.print( s );

	try {
	    name = in.readLine();
	}
	catch ( IOException e ) { }

	//instantiate the player's character

	s = "Choose thine class: \n \n";
        s += "Warrior - " + Warrior.about() + "\n \n";
	s += "Assassin - " + Assassin.about() + "\n \n";
	s += "Paladin - " + Paladin.about() + "\n \n";

	System.out.println(s);

	s = "Selection: ";

	System.out.println(s);

	try {
	    classselect = in.readLine();
	}
	catch (IOException e) {}

	if ( classselect.equals("Warrior") || classselect.equals("warrior")){
	    pat = new Warrior (name);
	}
	else if (classselect.equals("Assassin") || classselect.equals("assassin")){
	    pat = new Assassin (name);
	}
        else if (classselect.equals("Paladin") || classselect.equals("paladin")){
	    pat = new Paladin (name);
	}
	else {
	    System.out.println("That nay be a class, friend!");
	}

    }//end newGame()
    

  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    post: Returns true if player wins (monster dies).
    Returns false if monster wins (player dies).
    =============================================*/
  public boolean playTurn()
  {
    int i = 1;
    int d1, d2;

    if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    //random double is chosen to choose which monster will appear
	    double wMon = Math.random();
	    if (wMon < .33){
		smaug = new Demon();
		System.out.println( "YE SHALL FACE THE DEMON");
	    }
	    else if (wMon < .66){
		smaug = new Zombie();
		System.out.println( "YE SHALL FACE THE ZOMBIE");
	    }
	    else{
		smaug = new Kraken();
	        System.out.println( "YE SHALL FACE THE KRAKEN");}

	    while (smaug.isAlive() && pat.isAlive()) {
		// Give user the option of using a special attack:
		// If you land a hit, you incur greater damage,
		// ...but if you get hit, you take more damage.
		try {
		    System.out.println( "\nDo you feel lucky?" );
		    System.out.println( "\t1: Nay.\n\t2: Aye!" );
		    i = Integer.parseInt( in.readLine() );
		}
		catch ( IOException e ) { }

		if ( i == 2 )
		    pat.specialize();
		else
		    pat.normalize();

		d1 = pat.attack(smaug);
		d2 = smaug.attack(pat);

		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage.");

		System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() + " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
		System.out.println( "'Twas an epic battle, to be sure... " + 
				    "You cut ye olde monster down, but " +
				    "with its dying breath ye olde monster. " +
				    "laid a fatal blow upon thy skull." );
		return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
		System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
		return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
		System.out.println( "Ye olde self hath expired. You got dead." );
		return false;
	    }
    }//end else

    return true;
  }//end playTurn()
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void main( String[] args )
    {
	//As usual, move the begin-comment bar down as you progressively 
	//test each new bit of functionality...

	//loading...
	YoRPG game = new YoRPG();

	int encounters = 0;

	while( encounters < MAX_ENCOUNTERS ) {
	    if (!game.playTurn())
		break;
	    encounters++;
	    System.out.println();
	}

	System.out.println( "Thy game doth be over." );
	/*================================================
	  ================================================*/
    }//end main

}//end class YoRPG


