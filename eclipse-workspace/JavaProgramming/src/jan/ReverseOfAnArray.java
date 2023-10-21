package jan;

public class ReverseOfAnArray {
	public static void main(String []args) { 
		int a[]= {1,2,3,4,5};
		System.out.println("Before reversing the array");
		for( int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
		System.out.println("\nAfter reversing the array");
		for (int j=a.length-1;j>=0;j--){	
			System.out.print(a[j]);
		}
	}
}

	

