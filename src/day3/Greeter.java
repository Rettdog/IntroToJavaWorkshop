package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Enter your name here");
	JOptionPane.showMessageDialog(null, "Hello "+name+"! Nice to meet you.");
}
}
