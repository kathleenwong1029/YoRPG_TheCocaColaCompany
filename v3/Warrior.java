//Kathleen Wong , Ben Shapiro, Aidan Griffin
//The CocaCola Company
//APCS1 pd 1
//HW31-- Ye Olde Role Playing Game, Expanded
//2017-11-14

public class Warrior extends Protagonist {

    public Warrior(String a){
	super(a);
	_strength += 50;
	_defense -= 10;
    }

    public static String about(){
	return "The Warrior comes from a life of bravery, blood, and battle. \n Warriors train for years to achieve peak physical performance. \n Some warriors act as mercenaries, hiring themselves out to those who would \n pay a pretty penny for their services. Others humbly defend their villages \n from those who would do innocents harm. No matter \n the path a Warrior choses, one thing is certain: their blows are as fierce as a charging bull. They have exceptional \n strength, but in their furious onslaughts, \n often forget to defend themselves properly.";
    }


}
