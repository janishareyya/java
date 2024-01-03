package javaprogrammes.com;

import java.util.Scanner;

public class Swap2NumbersUsing3Variable {
	
		public static void main(String[] args) {
			int a,b,c;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the values of a, b : ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Before swapping : " +a+ " " +b);
			
			c=a;
			a=b;
			b=c;
			System.out.println("after swapping : " +a+ " " +b);
			
			sc.close();
		}

	}



