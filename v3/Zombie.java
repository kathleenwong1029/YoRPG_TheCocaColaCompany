//Kathleen Wong , Ben Shapiro, Aidan Griffin
//The CocaCola Company
//APCS1 pd 1
//HW31- Ye Olde Role Playing Game, Expanded
//2017-11-14

public class Zombie extends Monster{

    //The zombie has higher defense than other monsters.
    public Zombie (){
	super();
	_defense += .5;
    }

    public static String about(){
	return "A zombie wanders among the land of the living, searching for food. The undead are known for their difficulty to defeat and only a true protagonist will have the wits to slay and put this monster to rest";
	    }

    public static void main(String []args){
	//test cases
	Zombie k = new Zombie ();
	System.out.println(k._defense);
	System.out.println(k.about());
    }
}

      
