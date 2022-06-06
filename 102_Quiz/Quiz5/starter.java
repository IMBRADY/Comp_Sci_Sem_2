import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {		
	public static void main(String args[]) {
		// Your code goes below here
		int x;
		int y;
		System.out.println(function(5,2));
	}
	public static int function(int x, int y)
	{
		if(0 == x){
			return x+y;
		}
		else{
			return x+function(x-1,y);
		}
	}
}
