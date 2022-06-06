import pkg.*;
import java.util.*;


class starter {
	public static int min;
	public static int k;
	public static int sort;
	public static int val;
	public static boolean isTrue;
	public static void main(String args[]) {
		// Your code goes below here
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < 10; i++)
		{
			arr.add((int)(Math.random()*10));
			System.out.print(arr.get(i)+", ");
		}
		selectionSort(arr);
		System.out.println();
		for(int i = 0; i < 10; i++)
		{
			System.out.print(arr.get(i)+", ");
		}
	}
	public static void selectionSort(ArrayList<Integer> arr)
	{
		sort = 0;
		isTrue = true;
		while(isTrue)
		{
			isTrue = false;
			min = 10000;
			for(int i = sort; i < arr.size(); i++)
			{
				for(int b = 0; b < arr.size(); b++)
				{
					if(min > arr.get(i))
					{
						min = arr.get(i);
						val = i;
					}
				}
				arr.set(val,arr.get(sort));
				arr.set(sort,min);
				isTrue = true;
			}
			sort++;
		}
	}
}
