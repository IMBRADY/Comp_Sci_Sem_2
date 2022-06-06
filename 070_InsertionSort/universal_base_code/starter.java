import pkg.*;
import java.util.*;


class starter {
	public static int val;
	public static int k;
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++)
		{
			arr.add((int)(Math.random()*10));
			System.out.print(arr.get(i)+", ");
		}
		insertionSort(arr);
		System.out.println();
		for(int i = 0; i < 10; i++)
		{
			System.out.print(arr.get(i)+", ");
		}
	}
	public static void insertionSort(ArrayList<Integer> arr)
	{
		for(int i = 0; i < arr.size()-1; i++)
		{
			if(arr.get(i) > arr.get(i+1))
			{
				val = i+1;
				for(int c = val; c > 0; c--)
				{
					if(arr.get(c) < arr.get(c-1))
					{
						k = arr.get(c);
						arr.set(c,arr.get(c-1));
						arr.set(c-1,k);
					}
				}
			}
		}
	}
}
