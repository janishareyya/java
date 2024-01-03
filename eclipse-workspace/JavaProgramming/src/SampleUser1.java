package javaprogrammes.com;

import java.util.Scanner;

public class SampleUser1 {
	public static void main(String[] args) {
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the vlues of a,b: ");
		a=sc.nextInt();
		b=sc.nextInt();
		
		System.out.println("Before swapping: "+a+" "+b);
		a=a+b;
		b=a-b;
	    a=a-b;
	    
	    System.out.println("After swapping: "+a+ " " +b);
	    
		
		sc.close();
	}

}
