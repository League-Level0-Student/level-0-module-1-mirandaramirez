package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer=JOptionPane.showInputDialog("there are 10 fishes 2 drown 4 swim away and 3 die how many are left");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(answer.equals("there is 1 left")) {
		score++;
		JOptionPane.showMessageDialog(null,"correct");
		
		}
		else {
		JOptionPane.showMessageDialog(null,"wrong");
         }
		// 5. Otherwise, say "wrong" and tell them the answer
		
		// 6. Add some more riddles
		JOptionPane.showInputDialog("why do bees hum");
		if(answer.equals("because they don't know the words")){
		score++;
		JOptionPane.showMessageDialog(null,"correct");
	    }
	    else {
	    JOptionPane.showMessageDialog(null,"wrong");
	    }
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null,"youre score is "+score);
	}
}

