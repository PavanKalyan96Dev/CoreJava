/* Data Types
Data types in Java define what kind of value a variable can store 
(like number, character, true/false, object, etc.).
*/

class j_2_DataTypes
{
    public static void main(String args[])
    {
            //Integer Types:Used for Whole numbers
            byte b = 100;      // 1 byte
            short s = 20000;   // 2 bytes
            int i = 100000;    // 4 bytes (most common)
            long l = 900000L;  // 8 bytes

            //Floating point numbers: Used for Decimal numbers
            float f = 5.75f;   // 4 bytes
            double d = 19.99;  // 8 bytes (most common)

            //Character Type: Used for Single characters
            char c = 'A';      // 2 bytes
            //Boolean Type: Used for true/false values
            boolean bool = true; // 1 byte

            //Non Primitive Data Types: Used for Objects and Strings ie Arrays, Classes,Objects, Interfaces

            String str = "Hello, World!"; // A sequence of characters

            // Print all the variables
            System.out.println("Byte: " + b);
            System.out.println("Short: " + s);
            System.out.println("Integer: " + i);
            System.out.println("Long: " + l);
            System.out.println("Float: " + f);
            System.out.println("Double: " + d);
            System.out.println("Character: " + c);
            System.out.println("Boolean: " + bool);
            System.out.println("String: " + str);



    }
}

//Output:
/*

Byte: 100
Short: 20000
Integer: 100000
Long: 900000
Float: 5.75
Double: 19.99
Character: A
Boolean: true
String: Hello, World!

*/


