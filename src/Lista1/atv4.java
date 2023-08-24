package Lista1;

import java.util.Scanner;

public class atv4 {
	static Scanner sc = new Scanner(System.in);
	static int a;
	static int b;
	public static void main(String[] args) {
		System.out.println(calculator());
	}
	public static void getNumbers() {
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public static int calculator() {
		getNumbers();
		System.out.println("Choise an operation:"
				+"\n(1)Sum"
				+"\n(2)Sub"
				+"\n(3)Mult"
				+"\n(4)Div");
		int op=sc.nextInt();
		switch(op){
		case 1:
			return a+b;
		case 2:
			return a-b;
		case 3:
			return a*b;
		case 4:
			return a/b;
		default:
			return 0;
		}
	}
}
