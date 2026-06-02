//Type Casting

/*
Type casting in Java means converting one data type into another data type.

Implicit Type Casting (Widening):Converting smaller data type → bigger data type automatically

byte → short → int → long → float → double

Explicit Type Casting (Narrowing) : Converting bigger data type → smaller data type manually

Syntax:

datatype variable = (datatype) value;

*/
public class j_14_Type_Casting {
    public static void main(String[] args) {
        
        //Implicit Type Casting (Widening)

        int x='a';
        System.out.println(x);  //97

        /* 1.The compiler is responsible to perform this type casting.
            2. When ever we are assigning lower datatype value to higher datatype variable
            then implicit type cast will be performed .
            3. It is also known as Widening or Upcasting.
            4. There is no loss of information in this type casting.
            
            */
        //Explicit Type Casting (Narrowing)
        double d=10.5;
        int y=(int)d;
        System.out.println(y); //10
        /* 
                        1. Programmer is responsible for this type casting. 
                        2. Whenever we are assigning bigger data type value to the smaller data type  variable then explicit type casting is required. 
                        3. Also known as Narrowing or down casting. 
                        4. There may be a chance of loss  of information in this type casting. 
        
        */
    }
    
}
