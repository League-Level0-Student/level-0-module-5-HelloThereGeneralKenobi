package nested_loops;

public class ForLoopGaunlet {
	public static void main(String[] args) {
		// for(int a = 1; a < 101; a++) {
		// System.out.println(a);
		// }
		// for(int b = 0; b < 101; b++) {
		// System.out.println(100 - b);
		// }
		// for(int c = 1; c < 51; c++) {
		// System.out.println(2*c);
		// }
		// for(int d = 1; d < 51; d++) {
		// System.out.println(2*d-1);
		// }
		// for(int e = 1; e < 101; e++) {
		// if(e%2 == 0) {
		// System.out.println(e + "is even");
		// }
		// else {
		// System.out.println(e + "is odd");
		// }
		// }
		// for(int f = 1; f < 112; f++) {
		// System.out.println(f*7);
		// }
		// for(int g = 0; g < 15; g++) {
		// System.out.println("In " + (2004 + g) + " I was " + g);
		// }
		// for(int h = 0; h < 3 ; h++) {
		// for(int i = 0; i < 3; i++) {
		// System.out.println(h + " " + i);
		// }
		// }
		// for (int j = 0; j < 9; j = j + 3) {
		// for (int k = 1; k < 4; k++) {
		// System.out.print(j + k);
		// }
		// System.out.println();
		// }
		// for (int l = 0; l < 100; l = l + 10) {
		// for (int m = 1; m < 11; m++) {
		// System.out.print(l + m + " ");
		// }
		// System.out.println();
		// }
		for (int n = 1; n < 6; n++) {
			for (int o = 1; o < 1 + n; o++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
