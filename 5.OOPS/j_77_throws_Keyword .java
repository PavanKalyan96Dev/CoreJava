//throws:The throws keyword indicates what exception type may be thrown by a method.
public class j_77_throws_Keyword {

    static void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
    
        throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else {
    System.out.println("Access granted - You are old enough!");
    }
}

public static void main(String[] args) {
    checkAge(15); // Set age to 15 (which is below 18...)
}
}
/*output

Exception in thread "main" java.lang.ArithmeticException: Access denied - You must be at least 18 years old.
        at j_77_throws_Keyword.checkAge(j_77_throws_Keyword.java:6)
        at j_77_throws_Keyword.main(j_77_throws_Keyword.java:14)

    */