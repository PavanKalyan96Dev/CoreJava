
//  Access Modifiers
/*
    Whenever we are writing our own classes compulsory we have to provide some
    information about our class to the jvm.
    Like
    1. Whether this class can be accessible from anywhere or not.
    2. Whether child class creation is possible or not.
    3. Whether object creation is possible or not etc.

    1. Public
    2. Default
    3. Final
    4. Abstract
    5. Strictfp

 */

//private 
class j_33_Access_Modifiers {
    private int x = 10;

    void show()
    {
        System.out.println(x);// we can access private variable inside the class only
    }
}

public class Demo {
    public static void main(String[] args) {
        j_33_Access_Modifiers obj = new j_33_Access_Modifiers();
        // System.out.println(obj.x); // we cannot access private variables outside of the class
    }
}