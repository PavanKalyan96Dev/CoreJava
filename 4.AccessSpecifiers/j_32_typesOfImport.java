/*Types of imports in java
1.Explicit class import : You import a specific class only from a package instead of importing all classes.
2.Implicit class import:  Some classes/packages are automatically available by default, so you don’t need to write the import statement.
*/

import java.util.Scanner; // explicit class import

public class j_32_typesOfImport {
    public static void main(String[] args) {

        // Using Scanner (explicit import)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        

        // Implicit import example (java.lang.* is auto imported)
        String msg = "This String is from java.lang (implicit import)";
        System.out.println(msg);

        int max = Math.max(10, 20); // Math is also from java.lang
        System.out.println("Max is: " + max);

    }
}