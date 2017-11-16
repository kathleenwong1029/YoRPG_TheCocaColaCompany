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

    //Protagonist can collect or recieve Cans O' Cola as a reward
    private int cansOCola;
    private int canReward;
    private int choice;

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
	Protagonist ham = new Warrior("ham");

	s = "Choose thine class: \n \n";
        s += "Warrior - " + ham.about() + "\n \n";

	ham = new Assassin("ham");

	s += "Assassin - " + ham.about() + "\n \n";

	ham = new Paladin("ham");

	s += "Paladin - " + ham.about() + "\n \n";

	ham = new Archer("ham");

	s += "Archer - " + ham.about() + "\n \n";

	ham = new Musketeer("ham");

	s += "Musketeer - " + ham.about() + "\n \n";

	ham = new Arbalest("ham");

	s += "Arbalest - " + ham.about() + "\n \n";

	ham = new Mage("ham");

	s += "Mage - " + ham.about() + "\n \n";

	ham = new Warlock("ham");

	s += "Warlock - " + ham.about() + "\n \n";

	ham = new Sorceror("ham");

	s += "Sorceror - " + ham.about() + "\n \n";

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
	else if (classselect.equals("Archer") || classselect.equals("archer")){
	    pat = new Archer (name);
	}
	else if (classselect.equals("Musketeer") || classselect.equals("musketeer")){
	    pat = new Musketeer (name);
	}
	else if (classselect.equals("Arbalest") || classselect.equals("arbalest")){
	    pat = new Arbalest (name);
	}
	else if (classselect.equals("Mage") || classselect.equals("mage")){
	    pat = new Mage (name);
	}
	else if (classselect.equals("Warlock") || classselect.equals("warlock")){
	    pat = new Warlock (name);
	}
	else if (classselect.equals("Sorceror") || classselect.equals("sorceror")){
	    pat = new Sorceror (name);
	}
	else {
	    System.out.println("That nay be a class, friend! Try again!");

	    System.exit(0);

	}

	System.out.println("\n Your stats: \n" + "Health: " + Integer.toString(pat._hitPts) + "\n" + "Strength: " + Integer.toString(pat._strength) + "\n" + "Defense: " + Integer.toString(pat._defense) + "\n" + "Dexterity: " + Integer.toString(pat._dex) + "\n" + "Intelligence: " + Integer.toString(pat._intel) + "\n" + "Class: " + classselect);

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

    if ( Math.random() >= ( difficulty / 3.0 ) ){
	    System.out.println( "\nNothing to see here. Move along!" );

      //no battle results in up to 29 cans
      canReward = (int)(Math.random() * 30);
      System.out.println(canReward + " cans O cola seem to have fallen from the skies");
      cansOCola += canReward;
    }
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

		if (pat.hitchance() && smaug.hitchance()){
		d1 = pat.attack(smaug);
		d2 = smaug.attack(pat);

		System.out.println( "\n" + pat.getName() + " dealt " + d1 +
				    " points of damage.");

		System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() + " for " + d2 + " points of damage.");

		}
		else if (!pat.hitchance() && smaug.hitchance()){

		    d2 = smaug.attack(pat);

		    System.out.println("You missed!");

		    System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() + " for " + d2 + " points of damage.");

		}
		else {

		    System.out.println("Both ye and the monster missed! Fools!");

		}



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

    //winning a battle will result in up to 49 cans
    canReward = (int)(Math.random() * 50);
    System.out.println(canReward + " cans O' cola seem to have fallen from the skies");
    cansOCola += canReward;
		return true;
  }
  //option 3: the beast slays you
  else if ( !pat.isAlive() ) {
System.out.println( "Ye olde self hath expired. You got dead." );

  // player has option of revival
  if(cansOCola > 40){
      String a;
     a = "Ye has collected " + cansOCola + " cans O' cola";
     a += "\n Revival will cost ye 50 cans";
     a += "Do ye wish to be revived? \n";
     a += "\t1: I shall fight on! \n";
     a += "\t2: Let me rest.";
     System.out.println (a);

     try {
       choice = Integer.parseInt(in.readLine());
     }
     catch ( IOException e ) { }

     if (choice == 1){
       // if revived, protagonist is given 100 hitPts to continue
       pat._hitPts = 100;
       cansOCola -= 40;
       return true;
     }
     else {
       return false;
        } //end revival option
      }
        else {
          //if player does not have 50 cans, they cannot pay for revival
          return false;
        }
      }// end option 3
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
