package cse360assign3;
// CalculatorGitHob/vidya_test/src/cse360assign3/Calculator.java 
/** Name: Vidya Sridhar
 * @author - Vidya for Spring 2016
 * Course: CSE 360:Intro to Software Engineering 2016 Spring
 * PIN: 814
 * Title: Assignment 3
 * File name: Calculator.java
 * @version February 20, 2016
 */
public class Calculator {
	
private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
			return total;
	}
	
	public void add (int value) {
		total = total + value;
		//return total;
	}
	
	public void subtract (int value) {
		total = total - value;
		//return total;
	}
	
	public void multiply (int value) {
		total = total * value;
	}
	
	public void divide (int value) {
		if(value != 0)
			total = total / value;
		else
			total = 0;
	}
	
	public String getHistory () {
		return "";
	}

}
