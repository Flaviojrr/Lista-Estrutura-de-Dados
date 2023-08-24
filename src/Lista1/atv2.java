package Lista1;

import java.util.Scanner;

public class atv2 {
	static Scanner sc = new Scanner(System.in);
	static int a;
	static int b;
	public static void main(String[] args) {
		System.out.println(comparer());
	}
	public static void numbers() {
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public static boolean comparer() {
		numbers();
		if(a==b) {
			return true;
		}
		return false;	
	}
}
