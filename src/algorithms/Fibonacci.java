package algorithms;

public class Fibonacci {
	public static void main(String[] args) {
		int secondLast = 0;
		int last = 1;
		for(int i = 0; i < 11; i++) {
			int next = secondLast + last;
			secondLast = last;
			last = next;
			System.out.println(last);
		}
	}
}
