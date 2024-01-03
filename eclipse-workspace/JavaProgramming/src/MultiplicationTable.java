package javaprogrammes.com;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		
     int i,n;
     Scanner sc = new Scanner(System.in);
      System.out.println("The multiplication Table is : ");
      n=sc.nextInt();
       
      for( i=0; i<=20; i++) {
    	  System.out.println(n+ "*" +i+ "=" +n*i);
    	  sc.close(); 
      }

	}

}
