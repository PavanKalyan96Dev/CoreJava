/* INFINITY REPRESENTATION */
public class j_7_Infinity {
    
    public static void main(String[] args) {
        
        System.out.println(10/0.0);
        System.out.println(-10/0.0);
        System.out.println(0/0.0);
        System.out.println(10/0);
    }
}
/* OUTPUT

Infinity
-Infinity
NaN
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at j_7_Infinity.main(j_7_Infinity.java:8)

*/