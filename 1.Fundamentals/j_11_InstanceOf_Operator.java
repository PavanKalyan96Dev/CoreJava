//Instanceof Operator
//The instanceof operator in Java is used to check whether an object belongs to a specific class or interface.
public class j_11_InstanceOf_Operator {
    
    public static void main(String[] args) {
        
        String s1="pavan";
        System.out.println(s1 instanceof String);  // true

            Integer num = 10;

            System.out.println(num instanceof Integer);  // true
            System.out.println(num instanceof Number);   // true (parent class)
            System.out.println(num instanceof Object);   // true (top class)


;    }
}