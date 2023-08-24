package Lista1;

import java.util.Scanner;

public class atv3 {
	static Scanner sc = new Scanner(System.in);
	static float a;
	static float b;
	public static void main(String[] args) {
		System.out.println(result());
	}
	public static void numbers() {
		a=sc.nextFloat();
		b=sc.nextFloat();
	}
	public static float result() {
		numbers();
		return a*b;
	}
}
