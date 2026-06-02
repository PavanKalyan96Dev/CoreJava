
// Shift Operators
/*Shift Operators in java

Java shift operators are used to move (shift) bits left or right inside an integer number.
There are three shift operators in Java:

1. Left Shift (<<): Shifts bits to the left, filling the rightmost bits with zeros.
2. Right Shift (>>): Shifts bits to the right, filling the leftmost bits with the sign bit (the leftmost bit) for signed numbers.
3. Unsigned Right Shift (>>>): Shifts bits to the right, filling the leftmost bits with zeros regardless
of the sign of the number.

*/

class j_17_Shift_Operators {
    public static void main(String[] args) {

        int a = 8; // In binary: 0000 1000

        // Left Shift (<<)
        int leftShift = a << 2; // Shifts bits to the left by 2 positions
        System.out.println("Left Shift (8 << 2): " + leftShift); // Output: 32 (In binary: 0010 0000)

        // Right Shift (>>)
        int rightShift = a >> 2; // Shifts bits to the right by 2 positions
        System.out.println("Right Shift (8 >> 2): " + rightShift); // Output: 2 (In binary: 0000 0010)

        // Unsigned Right Shift (>>>)
        int unsignedRightShift = a >>> 2; // Shifts bits to the right by 2 positions, filling with zeros
        System.out.println("Unsigned Right Shift (8 >>> 2): " + unsignedRightShift); // Output: 2 (In binary: 0000 0010)

    }
}