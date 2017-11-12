//Kathleen Wong, Ben Shapiro, Aidan Griffin 
//Team : The CocaCola Company
//HW28 -- Ye Olde Role Playing Game
//2017-11-09

public class Protagonist extends Character{

    //variable creation
    
    public String name;

    //Constructor: initializes variables/stats of the protagonist

    public Protagonist(String a){
	super(70, 30);
	name = a;
    }

    //getName: returns the protagonist's name
    
    public String getName(){
	return name;
    }

    //Specialize: prepares the protagonist to perform a special attack. A special attack lowers the protagonist's defense but raises their attack

    public void specialize() {
	strength += 5;
	defense -= 5;
    }

    //Normalize: prepares the protagonist to perform a normal attack, by resetting the changes made by performing a special attack
    
    public void normalize() {
	defense = 30;
	strength = 70;
    }

    //quick tests
    
    public static void main (String[] args){
	Protagonist Kathleen = new Protagonist("Kathleen");
	System.out.println(Kathleen.isAlive());
	System.out.println(Kathleen.getDefense());
	System.out.println(Kathleen.getName());
	Kathleen.specialize();
	System.out.println(Kathleen.getDefense());
    }

}
