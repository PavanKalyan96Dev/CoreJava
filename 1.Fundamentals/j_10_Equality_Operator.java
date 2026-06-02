
//Equality Operator
/*  We can apply equality operators for every primitive type including boolean type also
but we can't apply equality operator for the reference types because in that case it will compare the references but not the content of the objects.

*/
public class j_10_Equality_Operator {
    public static void main(String[] args) {
        System.out.println(10 == 20) ;  //false
        System.out.println('a' == 'b' );   //false
        System.out.println('a' == 97.0 );  //true
        System.out.println(false == false); //true
    }
}



 /*  What is the difference between == operator and .equals( ) method ?
            In general we can use .equals( ) for content comparision where as == operator
            for reference comparision
        
                String  s1=new String("ashok");
                String  s2=new  String("ashok");
                System.out.println(s1==s2);  //false
                System.out.println(s1.equals(s2));  //true  */