package jan;

public class MultiDimensionalArray {
public static void main(String args[]) {
	int i,sum=0;
	int a[][]= {{1,5,7},{4,5,6},{7,5,4}};
	//either we can write the array size as for(i=0;i<a.length;i++)
	for(i=0;i<3;i++) {
		//(j<a.length)
		for(int j=0;j<3;j++) {
			sum=sum+a[i][j];	
		}
	}	
	System.out.println("Sum of the Multidimentional array:"+sum);	
}
	}
	


