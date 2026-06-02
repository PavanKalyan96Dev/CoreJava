
/*Bitwise Operators.java
Bitwise operators are used to perform operations directly on binary (bits) of integer values (int, byte, short, long). 
These operators work at bit level (0s and 1s).

Bitwise Operators : ( & , | , ^) 1. & (AND)

1.If both arguments are true then only result is true.
2. | (OR): if at least one argument is true. Then the result is true.
3. ^ (X-OR) : if both are different arguments. Then the result is true.
 */
class j_12_Bitwise_Operators {
    public static void main(String[] args) {

        // And Operator &
        System.out.println(true&true); //true
        System.out.println(true&false); //false
        System.out.println(false&true); //false
        System.out.println(false&false); //false

        // OR Operator |
        System.out.println(true|true); //true
        System.out.println(true|false); //true
        System.out.println(false|true); //true
        System.out.println(false|false); //false
            
        System.out.println(4&5);//4            using binary digits
        System.out.println(4|5);//5      4-->100
        System.out.println(4^5);//1

        // Bitwise complement (~) (tilde symbol) operator:
        int a = 5; // In binary: 0000 0101
        int b = ~a; // Bitwise complement of a =-6

        //Boolean Compliment(!) operator
        boolean x = true;
        boolean y = !x; // y will be false

    }
 }