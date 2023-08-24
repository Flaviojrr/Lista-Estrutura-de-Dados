package Lista1;

import java.util.Scanner;

public class atv5 {
	static Scanner sc = new Scanner(System.in);
	static String productsName;
	static int min;
	static int max;
	public static void main(String[] args) {
		System.out.println(mediumStock());
	}
	public static void product() {
		System.out.println("Name:");
		productsName=sc.next();
		System.out.println("Minimum amount");
		min=sc.nextInt();
		System.out.println("Maximum amount");
		max=sc.nextInt();
	}
	public static int mediumStock() {
		product();
		System.out.println(productsName);
		return(min+max)/2;
	}
}
