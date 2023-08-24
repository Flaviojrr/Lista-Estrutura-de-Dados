package Lista1;

import java.util.Scanner;

public class atv1 {
	static Scanner sc = new Scanner(System.in);
	static private int a;
	static private int b;
	public static void main(String[] args) {
		System.out.println(comparer());
	}
	public static void numbers() {
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public static int comparer() {
		numbers();
		if(a<b) {
			return b;
		}else {
			return a;
		}
		
	}
}
