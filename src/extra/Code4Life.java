package extra;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {

		// 1. Ask the user how many hours they spent coding this week.
		String ans = JOptionPane.showInputDialog("How many hours have you spent coding this week?");
		// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
		// write code instead.
		int urmom = Integer.parseInt(ans);
		if (urmom < 2) {
			JOptionPane.showMessageDialog(null, "Code more ya nerd.");
		} else if (urmom > 5) {
			playBatmanTheme();
		} else {
			JOptionPane.showMessageDialog(null, "Dang you'r epic.");
		}
		// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
		// they're a Code Ninja
		// 4. If it is more than 5, call the method below to play the Batman theme song.
	}

	private static void playBatmanTheme() {
		try {
			AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
