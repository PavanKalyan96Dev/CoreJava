
//classes
/* A class is a blueprint for the object. 

We can think of the class as a sketch (prototype) of a house. 
It contains all the details about the floors, doors, windows, etc. 
Based on these descriptions we build the house. House is the object.

Since many houses can be made from the same description,
we can create many objects from a class

Syntax:

class ClassName {
  // fields
  // methods
}

Here, fields (variables) and methods represent
the state and behavior of the object respectively.

fields are used to store data
methods are used to perform some operations

 */

class BiCycle{
    int gear;
    int speed=50;

    public void applyBreak(int decrement)// methods
    {
        speed -= decrement;
        System.out.println("speed is decreased:"+speed);
    }
    public void speedUp(int increment) //methods
    {
        speed += increment;
        System.out.println("speed is increased: "+speed);
    }
}
public class j_35_classes {

    public static void main(String[] args)
    {

        BiCycle b1=new BiCycle(); //object creation
        System.out.println(b1.speed);

        //An object is called an instance of a class. For example, 
        //suppose Bicycle is a class then b1 and b2 are the instances of the class. 

        //An object is an instance of a class. When a class is defined, no memory is allocated but when it is
        // instantiated (i.e., an object is created), memory is allocated.

        b1.applyBreak(10); // accessing the methods by using the object reference variable

        BiCycle b2=new BiCycle(); //object creation

        System.out.println(b2.speed);   // we can access the fields of a class
        b2.speedUp(10); // accessing the methods by using the object reference variable

        // we can access the fields of a class
        
        
    }
}

/* Output

50
speed is decreased:40
50
speed is increased: 60

 */