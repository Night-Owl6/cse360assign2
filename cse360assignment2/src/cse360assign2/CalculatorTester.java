package cse360assign2;

class CalculatorTester {
	
	public static void main(String[] args) {
		
		// object of AddingMachine
		
		AddingMachine calculator = new AddingMachine();
		
		//calling method
		
		calculator.add(4);
		calculator.subtract(2);
		calculator.add(5);
		
		System.out.println("history: " + calculator.toString());
		System.out.println("Total: " + calculator.getTotal());
		
	}
}
