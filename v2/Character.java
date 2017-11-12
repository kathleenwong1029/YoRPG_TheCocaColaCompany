//Aidan Griffin, Ben Shapiro, Kathleen Wong
//The Coca-Cola Company
//APCS1 pd1
//HW30 -- Ye Olde Role Playing Game, Improved
//2017-11-11
public class Character{
    //variable declaration
    public int health, strength, defense;
    public double attackRating;
    //constructor initializing variables
    public Character(int s, int d){
	health = 100;
	strength = s;
	defense = d;
	attackRating = 0.2 + Math.random();
    }
    //isAlive: checks if the character is alive by checking if the character's health is greater than 0: if not, the character is dead (returns false)  
    public boolean isAlive(){
        return (health > 0);
    }
    //getDefense: returns the defense stat of the character  
    public int getDefense(){
        return defense;
    }
    public int getStrength(){
	return strength;
    }
    //lowerHP: changes the character's current HP based on how much damage it took in a turn. If HP reaches 0 or less, the character is dead  
    public void lowerHP(int x){
	health -= x;
    }
    //attack: Calculates damage done by a character to another character, based on the character's strength and attack and the other character's defense stat      
    public int attack(Character Aidan){
	int damage = ((int) (attackRating * strength)) - Aidan.defense;
	Aidan.lowerHP(damage);
	return damage;
    }
    public static void main(String[] args){
	Character Mike = new Character(70, 50);
	System.out.println(Mike.strength);
    }
}    
