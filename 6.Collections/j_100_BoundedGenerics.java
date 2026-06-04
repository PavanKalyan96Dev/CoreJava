//Bounded Generic types
package com.example.collections;
public class j_100_BoundedGenerics {
	
	public static <T extends Number> void Print(T nums) //Only numbers are allowed
	{
		System.out.println(nums);
	}
	public static void main(String args[]) {
		Print(100);
		Print(100.45);
		Print(100.0985);
		Print(3456.0876);
		
		/*error: bcoz we have restricted all data types except Numbers
		Print("Pavan"); 
		Print(True);
		Print(c);  */
	}
	
}
/*OUTPUT
 100
100.45
100.0985
3456.0876

 */