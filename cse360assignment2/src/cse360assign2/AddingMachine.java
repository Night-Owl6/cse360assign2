package cse360assign2;

/**
* The AddingMachine program implements an application that
* simply add and subtract "value" that its given. 
* Also return string and total value. 
* 
* website url to my  github repositories
* https://github.com/ajaytiwari99/cse360assign2
* 
* @author Ajay Tiwari
* @classID	85141
* @version Assignment 2
*
*/
public class AddingMachine {
	
	private int total;
	private String history;
	
	/*
	 * AddingMachine constructor 
	 * sets initial value to total and history
	 * 
	 */	
	
	public AddingMachine () {
		
		total = 0;  // not needed - include for clarity
		history = "0"; // not needed - include for clarity
	}
	
	/*
	 * returns the value of total
	 * 
	 */	
	
	public int getTotal () {
		
		return total;
	}
	
	/*
	 * @param Value, value is added to total
	 * stores the calculation in history
	 * 
	 */	
	
	public void add (int value) {
		
		total = total + value;
		history = history + " + " + value;
	}
	
	/*
	 * @param value, value is subtracted from total
	 * stores the calculation in history
	 * 
	 */
	
	public void subtract (int value) {
		
		total = total - value;
		history = history + " - " + value;
	}
	
	/*
	 * @return history, stores all calculation in history
	 * 
	 */
	
	public String toString() {
		
		return history;
	}
	
	public void clear() {
		
	}
}

