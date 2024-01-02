package javaprogrammes.com;

import java.util.*;

public class CheckPositiveOrNegative {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		
		if(a>0) {
			System.out.println("It is positive");
		}
		else {
			System.out.println("It is Negative");
		}
	}

}
