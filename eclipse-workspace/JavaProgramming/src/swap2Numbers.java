package javaprogrammes.com;

public class swap2Numbers {
	public static void main(String[] args) {
		int a=3,b=9;
		System.out.println("before swapping: "+a+" "+b);	
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swapping: "+a+" "+b);
		
		
	}
	

}
