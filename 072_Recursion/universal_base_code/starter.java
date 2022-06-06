import pkg.*;
import java.util.*;

class starter {
	public static void recurPower(int base, int n){
		if(n == 0)
			return;
		else
		{
			base = base*base;
			System.out.print(base+" ");
			recurPower(base, n-1);
		}
	}	

	public static void main(String args[]) {
		recurPower(3, 5);
	}
}
