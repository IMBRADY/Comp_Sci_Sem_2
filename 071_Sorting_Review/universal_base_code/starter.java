import pkg.*;
import java.util.Scanner;
import java.util.*;


class starter {
	public static boolean isTrue;
	public static int k;
	//Precondition: A and B are presorted in ascending order. 
	//Sort A and B into C.
	public void 3mergeSort(int [] A, int []B, int [] C){
		bubbleSort(A[]);
		bubbleSort(B[]);
	}

	//A is the full array unsorted. 
	//First is the beginning index of the array A, last is the last index of the array.
	//Split A in two halves and sort independently. Then merge back into A.
	public void mergeSort(int [] A, int first, int last){
		
	}
	public void bubbleSort(int [] A)
	{
		isTrue = true;
		while(isTrue)
		{
			isTrue = false;
			for(int c = 0; c < arr.size()-1; c++)
			{
				if(arr.get(c) > arr.get(c+1))
				{
					k = arr.get(c+1);
					arr.set(c+1,arr.get(c));
					arr.set(c,k);
					isTrue = true;
				}
			}
		}
	}
	public static void main(String args[]) {
		
	}
}
