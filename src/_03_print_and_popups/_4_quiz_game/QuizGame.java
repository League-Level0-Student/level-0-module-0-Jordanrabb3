package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
				String question =JOptionPane.showInputDialog("how old are you?");
				// 3.  Use an if statement to check if their answer is correct
				if (question.equals("18")) {
					JOptionPane.showMessageDialog(null, "You are correct");
					score = score + 1;
				} else {
					JOptionPane.showMessageDialog(null,"that is incorrect");
							
				}
				// 4.  if the user's answer was correct, add one to their score 
				
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		question =JOptionPane.showInputDialog("what school do you go to");
		
		if (question.contentEquals("Millikan")) {
			JOptionPane.showMessageDialog(null, "oh really?");
			score = score +1;
		}else {
			JOptionPane.showMessageDialog(null, "eww trashy");
		}
		// After all the questions have been asked, tell the user their final score 
		
	}
}
