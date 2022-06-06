import java.util.*;

class starter {
	public static int sort;
	public static int k;
	public static boolean isTrue;
	public static int val;
	public static int min;
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		for(int poole = 0; poole < 100; poole++)
		{
			arr1.add((int)(Math.random()*101));
			System.out.print(arr1.get(poole)+", ");
		}
		System.out.println();
		System.out.println("Bubble Sort");
		bubbleSort(arr1);
		for(int poole = 0; poole < 100; poole++)
		{
			System.out.print(arr1.get(poole)+", ");
		}
		System.out.println();
		for(int poole = 0; poole < 100; poole++)
		{
			arr2.add((int)(Math.random()*101));
			System.out.print(arr2.get(poole)+", ");
		}
		System.out.println();
		System.out.println("Selection Sort");
		selectionSort(arr2);
		for(int poole = 0; poole < 100; poole++)
		{
			System.out.print(arr2.get(poole)+", ");
		}
		System.out.println();
		for(int poole = 0; poole < 100; poole++)
		{
			arr3.add((int)(Math.random()*101));
			System.out.print(arr3.get(poole)+", ");
		}
		System.out.println();
		System.out.println("Insertion Sort");
		insertionSort(arr3);
		for(int poole = 0; poole < 100; poole++)
		{
			System.out.print(arr3.get(poole)+", ");
		}
	}
	public static void bubbleSort(ArrayList<Integer> arr)
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
