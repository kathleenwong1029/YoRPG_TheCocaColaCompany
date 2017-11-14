//Kathleen Wong , Ben Shapiro, Aidan Griffin
//The CocaCola Company
//APCS1 pd 1
//HW31-- Ye Olde Role Playing Game, Expanded
//2017-11-14

public class Kraken extends Monster{

    //The Kraken has higher hitPts and strength than other monsters.
    public Kraken (){
	super();
	_hitPts += 50;
	_strength += 20;
    }

    public static String about(){
	return "This legendary sea monster appears once every blue moon. Legends of its massive size and fearsome appearance have reached the ears of every sailor. Legends also states that this monster has never tasted defeat. It awaits the true protagonist that will be able to claim victory";
	    }
    
    public static void main(String []args){
	//test cases
	Kraken k = new Kraken ();
	System.out.println(k._strength);
	System.out.println(k.about());
    }
}

      
