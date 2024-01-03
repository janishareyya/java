package javaprogrammes.com;
import java.util.Scanner;

public class CheckEvenOrOdd {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a: ");
		a=sc.nextInt();
		
		if(a%2==0) {
			System.out.println("It is Even");
		}
		else {
			System.out.println("It is Odd");
		}
		sc.close();
	}

}
