
 //GENERICS IN THE ARRAYS
 package com.example.collections;

public class j_94_genericArrays {
	public <T> void print(T[] arr) {
		for(T element :arr) {
			System.out.println(element);
		}
	}
}


package com.example.collections;

public class j_98_generic_array_Runner
{
	public static void main(String args[]) 
	{
	j_94_genericArrays obj=new j_94_genericArrays();
	Integer [] names = {1,2,3,4,4};
	//int [] name= {4,5,6,7,8};//error bcoz Java generics cannot support primitive data types 
	obj.print(names);

}
}
/*OUTPUT
pavan
kalyan
prem
nath
*/