package javaprogrammes.com;

import java.util.Scanner;

public class UserEvenNumbers {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range: ");
           n=sc.nextInt();
           
           System.out.println("The even numbers are : " );
           
           for(int i=2; i<=n; i=i+2) {
        	   System.out.println( +i);
           
	sc.close();
           }	
	}

}

