
package battle_pack;

import java.util.Scanner; //method to retrieve input

import javax.swing.JOptionPane;
/**
 * This code is a sample program to 
 * show the concepts I can achieve thus far
 *
 */

public class Maincode {
	// setup hit points with the user having advantage
	static int EnemyHP;
	static int UserHP110; 
	static int Damage;
	// create input
	static Scanner keyboard = new Scanner(System.in); 
	
	Dice_roll d= new Dice_roll(); //pulled in class for the dice roll

	/**
	 * 
	 */
	//used to show activate damage from hitpoints
	public int Attack(int HP, int Damage) { 
		HP = HP - Damage;
		return HP;
	//establishes how much damage will be done
	}
	public int SetDamage() {
		Damage = d.diceRoll();
		return Damage;
	//commits the damage without rerolling dice
	}
	public int GetDamage( ) {
		return Damage;
	}
	//resets HP if it is at or below 0
	public int GetHP(int HP) {
		if (HP <= 0) { 
			HP = 100;
			System.out.println("HP reset with method");
		}
		return HP;
	//sets current text with a new line
	}
	public String SetText(String s, String n) {
		s = s + "\n" + n;
		return s;
	}
	//returns text with no edits
	public String GetText(String s) {
		return s;
	}
	//used in the future, this will create a win count
	public int GetWins(int WinCount) {
		WinCount++;
		return WinCount;
	}
	//pulls text from user regarding name
	public String GetName() {
		String Name = JOptionPane.showInputDialog("What would you like your name to be?");
		return Name;
	}
	}