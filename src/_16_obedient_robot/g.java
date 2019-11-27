package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class g {
	static Robot r = new Robot();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = JOptionPane.showInputDialog(null, "what color do you want the shape to be");
		String b = JOptionPane.showInputDialog(null,"what shape do you want");
		r.penDown();
		if (a.equals("black")) {

			r.setPenColor(Color.black);
		}
		if (a.equals("white")) {

			r.setPenColor(Color.white);
		}
		if (a.equals("gray")) {

			r.setPenColor(Color.gray);
		}
		if(b.equals("square")) {
			drawSquare();
		}
		if(b.equals("triangle")) {
			drawTriangle();
		}
		if(b.equals("circle")) {
			drawCircle();
		}
		
		
	


	}
	
	static void drawSquare() {
		for (int i = 0; i < 4; i++) {
			r.penDown();
			r.move(200);
			r.turn(90);
	}
	}
	static void drawTriangle() {
r.penDown();
		r.move(200);
r.turn(140);
r.move(200);
r.turn(140);
r.move(200);
	}
static void drawCircle() {
	for (int i = 0; i < 200; i++) {
		r.penDown();
	
	r.turn(2);
	r.move(3);
	}
	
	
	
	
}





}
