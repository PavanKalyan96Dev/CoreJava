//method over riding: Method overriding in Java allows a subclass to provide a specific implementation of a method that is already defined in its parent class. It is one of the key 
//features of runtime polymorphism in object-oriented programming.
public class j_52_method_Overriding {
    public void show(){
        System.out.println("This is a parent class method");
    }

}
class child extends j_52_method_Overriding{
    public void show(){
        System.out.println("This is a child class method");
    }
}
class methodOverridingExample{
    public static void main(String args[]){
        child c = new child();
        c.show();
    }
}
/*OUTPUT
This is a child class method

*/
