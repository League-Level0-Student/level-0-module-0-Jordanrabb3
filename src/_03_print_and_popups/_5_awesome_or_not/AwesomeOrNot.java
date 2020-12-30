package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	number = number;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	number = ran.nextInt(4);
		// 3. Print your variable to the console
	system.out.println();
		// 4. Get the user to enter something that they think is awesome
	
		// 5. If your variable is  0
	if (number.equals(0)) {
		JOptionPane.showMessageDialog(null, "Awesome");
	}
			// -- tell the user whatever they entered is awesome!
	
		// 6. If your variable is  1
	if (number.equals(1)) {
		JOptionPane.showMessageDialog(null, "Okay");
	}
			// -- tell the user whatever they entered is ok.
	
		// 7. If your variable is  2
	if (number.equals(2)) {
		JOptionPane.showMessageDialog(null, "Boring");
	}
			// -- tell the user whatever they entered is boring.
	
		// 8. If your variable is  3
	if (number.equals(3)) {
		JOptionPane.showMessageDialog(null, "keep going");
	}
			// -- invent your own message to give to the user (be nice).

}
