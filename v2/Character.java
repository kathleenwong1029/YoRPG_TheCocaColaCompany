//Aidan Griffin, Ben Shapiro, Kathleen Wong
//The Coca-Cola Company
//APCS1 pd1
//HW30 -- Ye Olde Role Playing Game, Improved
//2017-11-11
public class Character{
    //variable declaration
    public static int health, strength, defense;
    public static double attackRating;
    //constructor initializing variables
    public Character(){
	health = 100;
	strength = 10 + (int) (70 * Math.random());
	defense = 25 + (int) (15 * Math.random());
	attackRating = 0.2 + Math.random();
    }
    public static boolean isAlive(){
	return (health > 0);
    }
    public static int getDefense(){
	return defense;
    }
    public static void lowerHP(int x){
	health -= x;
    }
    public static int attack(Character Aidan){
	int damage = ((int) (attackRating * strength)) - defense;
	Aidan.lowerHP(damage);
	return health;
    }
    public static void main(String[] args){
	Character Mike = new Character();
	System.out.println(Mike.strength);
    }
}    
