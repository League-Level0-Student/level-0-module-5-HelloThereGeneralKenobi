package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String num =  JOptionPane.showInputDialog("Input a number");
		int number = Integer.parseInt(num);
		for(int i = 2; i < number; i++ ) {
			if(number%i == 0) {
				JOptionPane.showMessageDialog(null, "That number is not prime.");
			}
			JOptionPane.showMessageDialog(null, "That number is prime.");
		}
	}
}
