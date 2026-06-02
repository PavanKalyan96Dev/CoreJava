Operators 


//Operators in Java are special symbols that perform specific operations on one, two, or three operands and return a result.

public class j_5_Operators {
    public static void main(String[] args) {


        //Increment and Decrement Operators

        int x = 5;
        System.out.println("Original x: " + x); // 5
        System.out.println("Post-increment x++: " + (x++)); // 5 (then x becomes 6)
        System.out.println("After post-increment, x: " + x); // 6
        System.out.println("Pre-increment ++x: " + (++x)); // 7
        System.out.println("After pre-increment, x: " + x); // 7
        System.out.println("Post-decrement x--: " + (x--)); // 7 (then x becomes 6)
        System.out.println("After post-decrement, x: " + x); // 6
        System.out.println("Pre-decrement --x: " + (--x)); // 5
        System.out.println("After pre-decrement, x: " + x); // 5

        // 1. Increment & decrement operators we can apply only for variables but not for constant values.other wise we will get compile time error.

                //System.out.println(5++); // Compile-time error: cannot apply '++' to a constant value

        // 2 We can't perform nesting of increment or decrement operator, other wise we will get compile time error
                //System.out.println(++x++); // Compile-time error: cannot apply '++' to the result of '++x'
                //System.out.println(x++++); // Compile-time error: cannot apply '++' to the result of 'x++'
            
        //3. For the final variables we can't apply increment or decrement operators ,other wise we will get compile time error
                final int y = 10;
                //System.out.println(y++); // Compile-time error: cannot apply '++' to a final variable

        



    
}
}






/* Arithmetic Operations : f we apply any Arithmetic operation b/w 2 variables a & b , 
the result type is always max(int , type of a , type of b)  

1.byte + byte=int
2. byte+short=int
3. short+short=int
4. short+long=long
5. char+char=int
6. char+int=int
12.*/

