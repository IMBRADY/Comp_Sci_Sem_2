import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		System.out.println();
		System.out.println();
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add((int)(Math.random()*10));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	public static void removeDup(ArrayList<Integer> arr)
	{
		int comp1;
		for(int i = 0; i < arr.size(); i++)
		{
			for(int c = 0; c < arr.size(); c++)
			{			
				comp1 = arr.get(c);
				if((comp1 == arr.get(i)) && (c != i))
				{
					arr.remove(c);
				}
			}
		}
	}
}
