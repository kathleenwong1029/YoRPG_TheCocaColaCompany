public class Assassin extends Protagonist {

    public Assassin (String a){
	super(a);
	attackRating += 0.5;
	health -= 20;
    }

    public static String about(){

	return "The Assassin lives a life in the shadows. Waiting and stalking their pray \n until just the right moment to go in for the kill and strike. And just as quickly as they appear, they \n vanish - such is the way of the silent killer. Trained by the Order of Darkness, \n an organization as mysterious as it is deadly, Assassins do their work clean and well.\n However, even the best Assassin is not prepared to be caught \n out in the open - they trade endurance for significant attack power.";
    }

    public static void main (String [] args){
        Protagonist Ben = new Assassin("Ben");
	System.out.print(Ben.health);
	System.out.print(Ben.attackRating);
    }
}
