package day3;

import javax.swing.JOptionPane;

public class Snooper {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter your full name here");
		String age = JOptionPane.showInputDialog("Enter your age here");
		String street = JOptionPane.showInputDialog("Enter your street name here");
		

		String story = (name+", you are "+age+". You live on "+street+". You shouldn't give out personal information to a computer.");
		JOptionPane.showMessageDialog(null, story);

	}
}
