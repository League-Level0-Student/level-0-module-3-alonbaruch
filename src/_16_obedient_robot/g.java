package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class g {	public static void main(String[] args) {
	// TODO Auto-generated method stub
	String a =JOptionPane.showInputDialog(null,"what color do you want the shape to be");
	Robot r = new Robot();
	r.setSpeed(5);
	r.penDown();
if(a.equals("black")) {
	
	r.setPenColor(Color.BLACK);
}
if(a.equals("white")) {
	
	r.setPenColor(Color.white);
}
if(a.equals("gray")) {
	
	r.setPenColor(Color.gray);
}
for (int i = 0; i < 4; i++) {
	r.move(200);
	r.turn(90);
	
}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


