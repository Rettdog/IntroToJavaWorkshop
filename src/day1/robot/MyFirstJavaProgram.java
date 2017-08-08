package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot c3po = new Robot("mini");
	
	c3po.penDown();
	c3po.setPenColor(Color.CYAN);
	c3po.setSpeed(10);
	c3po.move(100);
	c3po.turn(60);
	c3po.setPenColor(Color.BLUE);
	c3po.move(100);
	c3po.turn(60);
	c3po.setPenColor(Color.YELLOW);
	c3po.move(100);
	c3po.turn(60);
	c3po.setPenColor(Color.RED);
	c3po.move(100);
	c3po.turn(60);
	c3po.setPenColor(Color.ORANGE);
	c3po.move(100);
	c3po.turn(60);
	c3po.setPenColor(Color.BLACK);
	c3po.move(100);
	c3po.turn(60);
	}
}
