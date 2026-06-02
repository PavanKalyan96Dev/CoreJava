/* types of methods

1.User defined: these are the methods that we create in our class to perform specific tasks. 
2.Built in methods: these are the methods that are already defined in Java and we can use them directly 
                    without creating them. For example, Math.max() is a built in method that returns the maximum of two numbers.
3.instance methods: these are the methods that belong to an instance of a class. We need to create an object of the class to call these methods.
4.static methods: these are the methods that belong to the class rather than any specific instance.
                We can call these methods without creating an object of the class.

*/
public class j_38_typesOfMethods {

    public void greet() //user defined method
    {
        System.out.println("This is a user defined method");
        System.out.println(Math.max(10,20));//built in method
    }
    public void show() //instance method
    {
        System.out.println("This is an instance method");
    }
    public static void display() //static method
    {
        System.out.println("This is a static method");
    }
    public static void main(String args[]){

        j_38_typesOfMethods obj=new j_38_typesOfMethods();
        obj.greet(); // calling the user defined method 
        obj.show(); //obj is needed to call the instance method 
        display(); // we can call the static method directly without creating an object
    }
    
}
/* OUTPUT
This is a user defined method
20
This is an instance method
This is a static method

*/