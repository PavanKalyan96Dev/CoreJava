//Multiple generics in a method

package com.example.collections;

public class j_96_genericMethods {
	public <T,P> void show(T item1,P item2) //Multiple Generics in a single method
	{
		System.out.println("We call him:"+item1);
		System.out.println("We call him:"+item2);
	}
}


package com.example.collections;

import java.nio.channels.NonReadableChannelException;

public class j_97_genericMethodRunner {
	public static void main(String args[]) {
	j_96_genericMethods obj=new j_96_genericMethods();
	obj.show(100,"Power Star");

}
}
//We call him:100
//We call him:Power Star