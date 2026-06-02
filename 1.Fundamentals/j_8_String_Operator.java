
/*  String Operators

        1. The only overloaded operator in java is ' + ' operator some times it access 
        arithmetic addition operator & some times it access String concatenation 
        operator.
        2. If acts as one argument is String type , then '+' operator acts as concatenation 
        and If both arguments are number type , then operator acts as arithmetic 
        operator
        3. Ex :


*/
public class j_8_String_Operator {
    public static void main(String[] args) {

    String a="ashok";
    int  b=10 , c=20 , d=30 ;
    System.out.println(a+b+c+d);  //output : ashok102030
    System.out.println(b+c+d+a); //output : 60ashok
    System.out.println(b+c+a+d); //output : 30ashok30
    System.out.println(b+a+c+d); //output : 10ashok2030
        
    }
    
}