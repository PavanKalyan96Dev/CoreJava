//checked exceptions in java
 /*checked exceptions
Exceptions that are checked at compile time
✔ The compiler forces you to handle them
✔ Or you must declare them using throws

IOException,SQLException and FileNotFoundException are the examples of checked exceptions
*/

import java.io.*;

class j_83_checkedExceptions {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("abc.txt"); // checked exception
        BufferedReader br = new BufferedReader(fr);
    }
}
/*OUTPUT
Exception in thread "main" java.io.FileNotFoundException: abc.txt (No such file or directory)
        at java.base/java.io.FileInputStream.open0(Native Method)
        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
        */