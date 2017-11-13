//The Coca-Cola Company: Ben Shapiro, Kathleen Wong, Aidan Griffin
//APCS1 pd1
//HW #28 - Ye Olde Role Playing Game
//2017-11-08

public class Monster extends Character{
    private String name;
    //Constructor: initializes variables/monster stats
    public Monster(String newName){
	super(60, 40);
	name = newName;
    }

    //getName: returns the name of the monster
    public String getName(Monster a){
	return a.name;
    }

    //attack: Calculates damage done by the monster to the Protagonist, based on the monster's strength and attack and the protagonist's defense stat

    //main: quick test

    public static void main(String [] args){
	Monster Ben = new Monster("Aidan");
	System.out.println(Ben.getStrength());//should return 60
	System.out.println(Ben.getDefense());//should return 40
	System.out.println(Ben.attackRating);//should return random value b/w 0.2 and 1.2
    }
}
	
