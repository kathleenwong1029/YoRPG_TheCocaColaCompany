//The Coca-Cola Company: Ben Shapiro, Kathleen Wong, Aidan Griffin
//APCS1 pd1
//HW #30 - Ye Olde Role Playing Game, Improved
//2017-10-11

public class Character{

    public static int HP;
    public static int strength;
    public static int defense;
    public static double attackRating;

    public static boolean isAlive(){
	return (HP > 0);
    }

    public static int getDefense(){
	return defense;
    }

    public static void lowerHP (int damage){

	HP = HP - damage;
    }

    public static int attack (Character c){
	int damage = (int)(strength * attackRating) - c.defense;
	c.lowerHP(damage);
	return damage;
    }

    public static void main(String [] args){
	Character Ben = new Character();
	System.out.println(attack(Ben));
    }
    
}
