//Autoboxing means converting a primitive data type into its corresponding wrapper class object, 
//and unboxing means converting a wrapper class object back into the primitive type.
public class j_62_autoboxing {
    public static void main(String args[]){
        int a=10;
        Integer b=a;//autoboxing: converting primitive int to Integer object
        System.out.println("Autoboxing: "+b);

        Integer c=20;
        int d=c;//unboxing: converting Integer object to primitive int
        System.out.println("Unboxing: "+d);
    
    }
}
/* output
Autoboxing: 10
Unboxing: 20

*/