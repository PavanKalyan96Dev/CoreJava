//Comparable Interface
package com.example.collections;

import java.lang.foreign.ValueLayout;

public class j_101_ComparableInterface {
	public static <T extends Comparable <T>>T min(T item1,T item2) //comparable interface
	{
		if(item1.compareTo(item2)<0)// comparing two values
			return item1;
		return item2;
	}
}


package com.example.collections;

public class j_102_ComparableInterfaceRunner {
	public static void main(String args[]) {
			System.out.println("Min value is "+j_101_ComparableInterface.min(100,23));
	}
}