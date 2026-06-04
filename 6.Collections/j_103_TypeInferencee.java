package com.example.collections;

import java.util.ArrayList;
import java.util.List;

public class j_103_TypeInferencee {
	
	public static <T> List<T> add(List<T> list, T item1, T item2){
		list.add(item1);
		list.add(item2);
		return list;
	}
	
	public static void main(String args[]) {
		
		var list=add(new ArrayList<>(),1,2);
		System.out.println(list);
	}
}
//[1, 2]