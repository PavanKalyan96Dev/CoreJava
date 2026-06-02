// Assignment Operators

public class j_15_Assignment_Operator_Types {
    
    public static void main(String args[]){
        
        //simple assignment operator

        int x=100;
        System.out.println(x);

        //chained Assignement Operator
        int a,b,c;
        a=b=c=100;

        System.out.println(a);//100
        System.out.println(b);//100
        System.out.println(c);//100

        int d=10,e=50,f=100;
        System.out.println(d);//10
        System.out.println(e); //50
        System.out.println(f);//100


        //compound assignment operator
        d += 10;
        e -= 20;
        f *= 2;

        System.out.println(d);//20
        System.out.println(e); //30
        System.out.println(f);//200
    }
}
