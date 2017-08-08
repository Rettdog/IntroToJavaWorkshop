package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
public static void main(String[] args) {
	Robot myRobot = new Robot();
			
			myRobot.turn(180);
	
	myRobot.turn(-90);
	myRobot.setPenColor(Color.GREEN);
	myRobot.move(25);
	myRobot.turn(-90);
	myRobot.setPenColor(Color.BLACK);
	myRobot.move(50);
	myRobot.turn(90);
	myRobot.move(50);
	myRobot.turn(90);
	myRobot.move(50);
}
}
