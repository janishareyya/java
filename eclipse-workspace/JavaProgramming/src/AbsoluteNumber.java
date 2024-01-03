package javaprogrammes.com;

import java.util.Scanner;

class AbsoluteNumber {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		a=sc.nextInt();
		if(a<0) {
			a=a*(-1);
		}
	System.out.println("The absolute number : " +a);	
		
		sc.close();
		
	}

}

