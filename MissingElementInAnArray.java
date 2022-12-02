package week1D2Assignments2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		int l=arr.length,i;
		
		Arrays.sort(arr);
		System.out.println("The Length of the given Array is:"+l);
		for(i=1;i<l;i++)
		{
		if(i!=arr[i-1]) {
			System.out.println("The Missing Number is:"+i);
			break;
		} 
		
	}
	}
}
