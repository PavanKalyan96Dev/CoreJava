/*Based on the input we are passing we need to create more methods which suits the input,To overcome this problem , generics came into picture 
*/



//generics
package com.example.collections;

public class j_93_generics {
	private Object item;//if we declare obj as a type then we can store any type of value in it
	
	public void setItem(Object item) {
		this.item=item; //setters
	}
	public Object getItem() {
		return this.item; //getters
	}
}