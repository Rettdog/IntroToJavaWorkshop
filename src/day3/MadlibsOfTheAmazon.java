package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...

		// Get the user to enter an adjective
		String adjective = JOptionPane.showInputDialog("Enter an adjective here");
		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog("Enter a type of liquid here");
		// Get the user to enter a body part
		String bodyPart = JOptionPane.showInputDialog("Enter a body part here");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("Enter a verb here");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("Enter a place here");
		String name = JOptionPane.showInputDialog("Enter your name here");
		// Fit the user's words into this sentence, and save it in a String:
		 String story = ("Piranhas are more "+adjective+" during the day, so cross the river at night. \nPiranhas are attracted to fresh "+liquid+" and will most likely \ntake a bite out of your "+bodyPart+" if you "+verb+". Whatever \nyou do, if you have an open wound, try to find another way \nto get back to the "+place+". Good luck, "+name+"!");
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		 JOptionPane.showMessageDialog(null,story);
		 JOptionPane.showMessageDialog(null,"Well done. That was a funny story, "+name+". You have a good sense of humor.");
	}
}

