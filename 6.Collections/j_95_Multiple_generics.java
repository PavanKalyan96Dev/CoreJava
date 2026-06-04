//Multiple Generics
package com.example.collections;

class Pair<T, U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    void display() {
        System.out.println("Name: " + first);
        System.out.println("Id: " + second);
    }
}

public class j_95_Multiple_generics {
    public static void main(String[] args) {
        Pair<String, Integer> obj = new Pair<>("Pavan", 101);
        obj.display();
    }
}
/*OUTPUT
 
Name: Pavan
Id: 101

*/