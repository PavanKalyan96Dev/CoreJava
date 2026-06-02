//Constructor Overloading

public class j_46_Constructor_Overloading {

    j_46_Constructor_Overloading(){
        System.out.println("This is a default constructor");
    }
    j_46_Constructor_Overloading(String name){
        System.out.println("This is a parameterized constructor with one parameter: " + name);
       
    }
    j_46_Constructor_Overloading(String name,int age){
        System.out.println("This is a parameterized constructor with two parameters: " + name + " and " + age);
    }
    public static void main(String args[]){
           new j_46_Constructor_Overloading();
           new j_46_Constructor_Overloading("Pavan");
           new j_46_Constructor_Overloading("Pavan", 24);
    }
    
}
/*  output

This is a default constructor
This is a parameterized constructor with one parameter: Pavan
This is a parameterized constructor with two parameters: Pavan and 24

*/