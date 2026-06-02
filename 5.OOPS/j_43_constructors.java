public class j_43_constructors {

    j_43_constructors() //default constructor is a constructor that does not take any parameters. It is used to initialize the object of the class with default values. 
    //It is called when we create an object of the class without passing any arguments. 
    {
        System.out.println("This is a default constructor");
    }

    public static void main(String args[]){
        j_43_constructors obj = new j_43_constructors(); //once the obj is created then the default constructor will be called automatically and the message 
        //"This is a default constructor" will be printed on the console.

    }
}
/*OUTPUT

This is a default constructor

*/