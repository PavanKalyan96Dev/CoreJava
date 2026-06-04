//WE CAN USE "RETURN" KEYWORD IN GENRIC METHOD TOO 
package com.example.collections;

public class j_96_genericMethodss {
	//using return keyword in generics 
	
	public <T,P> T show(T item1,P item2) //we have to change the return type from void to T
	{
		System.out.println("We call him:"+item1);
		System.out.println("We call him:"+item2);
		return item1; // using return keyword
	}
}


package com.example.collections;

import java.nio.channels.NonReadableChannelException;

public class j_97_genericMethodRunner {
	public static void main(String args[]) {
	j_96_genericMethodss obj=new j_96_genericMethodss();
	System.out.println(obj.show(100,"Power Star"));

}
}
/*

We call him:100
We call him:Power Star
100