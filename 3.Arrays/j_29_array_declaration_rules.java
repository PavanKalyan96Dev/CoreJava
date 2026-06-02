// Array declaration rules


// Array Declaration Rules
public class j_29_array_declaration_rules {

    public static void main(String[] args) {

// Rule no 1: At the time of array creation compulsory we should specify the size otherwise we will 
//get compile time error.  


        int a[]=new int[4];
        System.out.println("size of the array is :"+a.length); //4

//Rule no 2:It  is legal to have an array with size zero in java.
        int b[]=new int[0];
        System.out.println("size of the array is :"+b.length); //0

// Rule no 3: f we are taking array size with -ve int value then we will get runtime exception saying 
//NegativeArraySizeException.  


    // int c[]=new int[-20];
    // System.out.println("size of the array is :"+c.length);//Exception in thread "main" java.lang.NegativeArraySizeException: -20
       // at j_29_array_declaration_rules.main(j_29_array_declaration_rules.java:22)
    
//rule no 4:The maximum allowed array size in java is maximum value of int size [2147483647].  

    //    int d[]=new int[2147483647];
    //     System.out.println("size of the arr ay is :"+d.length); //2147483647
        
        //int e[]=new int[2147483648];  OUTOFMEMORY ERROR
        //System.out.println("size of the array is :"+e.length); //error: integer number too large: 2147483648

        int f[]=new int[101];
        System.out.println("size of the array is :"+f.length); //101


    }
    
}