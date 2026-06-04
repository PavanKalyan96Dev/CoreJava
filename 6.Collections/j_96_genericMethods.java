
// generic methods

package com.example.collections;

public class j_96_genericMethods {
	public <T> void show(T item) //generic method
	{
		//void is the return type and <T> is the generic 
		System.out.println("We call him:"+item);
	}
}


package com.example.collections;

import java.nio.channels.NonReadableChannelException;

public class j_97_genericMethodRunner {
	public static void main(String args[]) {
	j_96_genericMethods obj=new j_96_genericMethods();
	obj.show(100);

}
}
//We call him:100