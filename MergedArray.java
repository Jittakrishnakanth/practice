package practice;
import java.util.Arrays;
public class MergedArray {
public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[]arr1 = {1,3,5,7};
	int[]arr2 = {2,4,6};
	int[]merged = new int[arr1.length+arr2.length];
	System.arraycopy(arr1,0,merged,0,arr1.length);
	System.arraycopy(arr2,0,merged,arr1.length,arr2.length);
	System.out.println(merged);


	}

}
