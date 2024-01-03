package javaprogrammes.com;

import java.util.Scanner;

public class DiffOfEvenOdd {
	public static void main(String[] args) {
		int i,n, evensum=0, oddsum=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("The difference between Even and Odd sums : ");
		n= sc.nextInt();
		
		i=1;
		while(i<=n) {
			if(i%2==0)
				evensum = evensum+i;
				else
					oddsum = oddsum+i;
			i++;
							
		}
		System.out.println("Sum of all even numbers are: "+evensum);
		System.out.println("Sum of all odd numbers are : " +oddsum);
		sc.close();
	}
	

}
