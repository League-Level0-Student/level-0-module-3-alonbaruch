//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot

	

		Robot a = new Robot();
		a.penDown();
		a.setSpeed(1000000000);
	for (int i = 0; i < 21; i++) {
		
		
		//3. Ask the user what color they would like the robot to draw
		String b = JOptionPane.showInputDialog("what color do you like the best, black, gray, white");
		//5. Use an if/else statement to set the pen color that the user requested
if(b.contentEquals("gray")) {a.setPenColor(Color.gray);
}
else if(b.contentEquals("white")) {a.setPenColor(Color.white);
}
else if(b.contentEquals("black")) {a.setPenColor(Color.black);



}else {
	a.setRandomPenColor();
}
//6.if user doesn't enter a number choose a random color


        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		a.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
for (int f = 0; f < 3; f++) {
	
 a.move(255);
a.turn(-90);
a.move(255);
a.turn(-90);
a.move(225);
a.turn(-90);
a.move(510);
a.turn(50);
a.move(225);
a.turn(-50);
a.move(225);
a.turn(35);
}}
	}}
