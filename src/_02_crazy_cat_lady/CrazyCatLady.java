//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _02_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
String a = JOptionPane.showInputDialog(null,"how many cats do you have");
		// 2. Convert their answer into an int
int b = Integer.parseInt(a);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
if(3<b) {JOptionPane.showMessageDialog(null,"you are a crazy cat person");}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
if(3>b && 0<b){
	playVideo("https://www.youtube.com/watch?v=7zIZVrl-ya0");
}
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		if(b==0) {
	playVideo("https://www.youtube.com/watch?v=ZJT9CeEhM10");	}
		}
	

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

