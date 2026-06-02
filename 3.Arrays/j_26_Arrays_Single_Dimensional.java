/*  Arrays in Java

An array is an indexed collection of fixed number of homogeneous data elements.  
The main advantage of arrays is we can represent multiple values with the same name 
so that readability of the code will be improved.

But the main disadvantage of arrays is:

Fixed in size that is once we created an array there is no chance of increasing or 
decreasing the size based on our requirement that is to use arrays concept compulsory 
we should know the size in advance which may not possible always.  


*/
public class j_26_Arrays_Single_Dimensional {
    public static void main(String[] args) {
        

        // single dimensional array declarations

        int[] a; // valid recommended way
        //int []a;  valid but not recommended way
        //int a[]; valid but not recommended way

        //At the time of declaration we can't specify the size otherwise we will get compile time error. 

        int b[]; // valid declaration
       // int c[5]; //error: array dimension missing
    }
    
}
