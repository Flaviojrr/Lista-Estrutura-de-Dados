package Lista1;

import java.util.Scanner;

public class atv6 {
	static Scanner sc = new Scanner(System.in);
	static String name;
	static String sex;
	static double h;
	public static void main(String[] args) {
		System.out.println(imc());
	}
	public static void person() {
		System.out.println("Name:");
		name=sc.next();
		System.out.println("Height:");
		h=sc.nextDouble();
		System.out.println("Sex:");
		sex=sc.next();
	}
	public static double imc() {
		person();
		if(sex.equalsIgnoreCase("w")) {
			return (62.1*h)-44.7;
		}else {
			return (72.7*h)-58;
		}
	}
}
