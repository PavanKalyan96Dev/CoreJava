//Relational Operators

public class j_9_Relational_Operator {
    public static void main(String args[]){
        int a=10 , b=20, c=30;
        System.out.println(a>b); // Output: false
        System.out.println(a<b); // Output: true
        System.out.println(a>=b); // Output: false
        System.out.println(a<=b); // Output: true
        System.out.println(a==b); // Output: false
        System.out.println(a!=b); // Output: true

        boolean result=false;
        boolean pending =true;

    // relational operators can be applied to boolean values      
    //System.out.println(result>pending); // Output: error

        //Can't apply RO to the Object types
        String s1="durga";
        String s2="durga";
        //System.out.println(s1>s2); // Output: error
      
    //Nesting relational Operator is not allowed
   // System.out.println(a>b>c); // Output: error

        
       
    }
    
}

