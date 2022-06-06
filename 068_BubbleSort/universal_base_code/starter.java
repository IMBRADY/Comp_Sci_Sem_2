import java.util.*;

class starter {
	public static int k;
	public static boolean isTrue;
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		bubbleSort(arr1);			//Create this method
		System.out.println();
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*10)));
		}
	}
	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
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
}
