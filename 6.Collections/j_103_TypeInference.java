//Type Inference
package com.example.collections;

public class Bucket<T> {
	
	
	private T item;
	public Bucket(T item) ////constructor
	{
		this.item=item;
	}
	public T getItem() //getters
	{
		return this.item;
	}

}

package com.example.collections;

import java.util.ArrayList;
import java.util.List;

public class j_103_TypeInference {
	
	public static <T> void addStore(T t, List<Bucket<T>> list) {
		Bucket<T> bucket=new Bucket<>(t);
		list.add(bucket);
		System.out.println("Item is added successfully "+t.toString());
	}
	
	public static void main(String args[]) {
		
		List<Bucket<String>> list=new ArrayList<>();
		j_103_TypeInference.addStore("pavan",list);
		
	}
}
//Item is added successfully pavan