package cse360assign3;
// CalculatorGitHob/vidya_test/src/cse360assign3/Calculator.java 
/** Name: Vidya Sridhar
 * @author - Vidya for Spring 2016
 * Course: CSE 360:Intro to Software Engineering 2016 Spring
 * PIN: 814
 * Title: Assignment 3
 * File name: Calculator.java
 * @version February 22, 2016
 */
public class Calculator {
	
private int total;
public String log="";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Description of getToTal - returns the total at each instant
	 * @return totalmof type int
	 */
	public int getTotal () {
			return total;
	}
	
	/**
	 * Description of add : Adds the value to the total
	 * adds the history to the string log
	 * @param value - value to be added
	 */
	public void add (int value) {
		
		total = total + value;
		if(log != "")
			log = log + " " + "+" + " " + value;
			
		else
			log = 0 + " " + "+" + " "  + value;
						
	}
	
	/**
	 * Decsiption of subtract : Subtracts the value from the total
	 * adds the history to the string log
	 * @param value - value to be subtracted
	 */
	public void subtract (int value) {
		
		total = total - value;
		if(log != "")
			log = log  + " " + "-" + " " + value;
			
		else
			log = 0 + " " + "-" + " "  + value;
			
	}
	
	/**
	 * Description of multiply: Multiplies the value with the total
	 * adds the calculation history to the log
	 * @param value - value to multiply
	 */
	public void multiply (int value) {
		total = total * value;
		if(log != "")
			log = log + " " + "*" + " "+ value;
		else
			log = 0 + " " + "*" + " "+  value;
			
	}
	
	/**
	 * Description of divide : Divides the total by the value
	 * adds the calculation history to the string log
	 * @param value - divisor-value to divide
	 * if parameter value is 0, division operation should return 0
	 */
	public void divide (int value) {
		if(value != 0)
			total = total / value;
		else
			total = 0;
		if(log != "")
			log = log + " " +  "/" + " "+ value;
		
		else
			log = 0  + " " + "/" + " "  + value;
	}
	
	/**
	 * Description of getHistory() : returns the string of the list of the operations performed
	 * after every arithmetic operation, the history is appended to the string
	 * @return string log
	 */
	public String getHistory () {
		return log;
	}

}
