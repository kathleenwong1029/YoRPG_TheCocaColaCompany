//Kathleen Wong , Ben Shapiro, Aidan Griffin
//The CocaCola Company
//APCS1 pd 1
//HW31-- Ye Olde Role Playing Game, Expanded
//2017-11-14

public class Paladin extends Protagonist {

    public Paladin (String a){
	super(a);
	_defense += 50;
	_strength -= 20;
    }

    public static String about(){
	return "The Paladin is an intimidating figure, clad in thick armor ardorned with countless crests and parchments, and more importantly \n equipped typically with a massive, battle-scarred shield. \n Paladins are men and women in service of the \n Church of Light, a widespread faith that many loyally cling to when desperate times come \n Paladins excell at protecting others, taking hits, and fending off the mightiest of blows, from the most \n fearsome of monsters. However, typically, their armaments are then inferior to those more focused around \n dealing damage, like Warriors and Assassins.";
    }
}
