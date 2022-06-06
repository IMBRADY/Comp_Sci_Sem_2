import java.util.*;

class starter {
	//Methods go here

	public static void main(String args[]) {
		ArrayList <Integer> arr = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many values do you want in your array?");
		int v = sc.nextInt();
		for(int i = 0; i < v; i++)
			arr.add((int)(Math.random()*9)+1);
		printArrayList(arr);
		System.out.println("How many values do you want to add?");
		int vv = sc.nextInt();
		addValuesArrayList(arr, vv);
		printArrayList(arr);
		System.out.println("What is your IP address?");
		int hehe = sc.nextLine();
	}
	public static void printArrayList(ArrayList<Integer> a){
		for(int i = 0; i < a.size(); i++)
			System.out.print(a.get(i)+" ");
		System.out.println();
	}
	public static void addValuesArrayList(ArrayList<Integer> a, int n){
		for(int i = 0; i < n; i++)
			a.add((int)(Math.random()*9)+1);
	}
}
