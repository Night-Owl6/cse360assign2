package cse360assign2;

/**
* The AddingMachine program implements an application that
* simply add and subtract "value" that its given. 
* Also return string and total value. 
*
* @author Ajay Tiwari
* @classID	85141
* @version Assignment 2
*
*/
public class AddingMachine {
	
	private int total;
	private String history;
	
	public AddingMachine () {
		
		total = 0;  // not needed - include for clarity
		history = "0"; // not needed - include for clarity
	}
	
	public int getTotal () {
		
		return total;
	}
	
	public void add (int value) {
		
		// adds the value to total
		// stores the calculation in history
		
		total = total + value;
		history = history + " + " + value;
	}
	
	public void subtract (int value) {
		
		// subtract the value to total
		// stores the calculation in history
		
		total = total - value;
		history = history + " - " + value;
	}
	
	public String toString() {
		
		//keeps the history of transaction
		
		return history;
	}
	
	public void clear() {
		
	}
}