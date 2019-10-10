/**
 * @author 		Ulises Chavez Escalante
 * Class ID 	CSE360-85141
 * assign2
 * 
 */
package cse360assign2;

import java.util.Scanner;

public class AddingMachine {

	private int total;
	
	public AddingMachine () {
		total = 0;  
	}
	
	public AddingMachine(int total) {
		this.total = total;
	}
	
	public int getTotal () {
		return this.total;
	}
	
	public void add (int value) {
		total = total + value;
	}
	
	public void subtract (int value) {
		total = total - value;
	}
		
	public String toString () {
		String s = "0 ";
		do {
		s = s  + Integer.toString(total);
		}
		while(total == 0);
		
		return s;
	}

	public void clear() {
	
	}
}
