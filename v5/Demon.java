//Kathleen Wong , Ben Shapiro, Aidan Griffin
//The CocaCola Company
//APCS1 pd 1
//HW31-- Ye Olde Role Playing Game, Expanded
//2017-11-14

public class Demon extends Monster{

    //The Demon has higher attack than other monsters.
    public Demon (){
	super();
	_meleeattack += .5;
    }

    public static String about(){
	return "A demon lurks in the shadows, called upon from Lucifer's realm. A terrifying creature that strikes fear in any mortal. His attacks are deadly and only a true protagonist may defeat this monster.";
	    }
    
    public static void main(String []args){
	//test cases
	Demon k = new Demon ();
	System.out.println(k._meleeattack);
	System.out.println(k.about());
    }
}

      
    
