package assignments;

import java.util.Scanner;

public class sum {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int a = sc.nextInt();
		System.out.println("Enter the value of B");
		int b=sc.nextInt();
		while(a!=0) {
			a--;
			b++;
		}
		System.out.println(b);

	}
}
