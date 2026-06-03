public class j_74_try{
    public static void main(String arga[]){
        int numerator=10;
        int denominator=0;
        try{
            int result=numerator/denominator;
            System.out.println("Result is:"+result);
        }catch(ArithmeticException e){
            System.out.println("Exception occured: "+e.getMessage());

        }
        System.out.println("end of the program ");
    }
}
/*OUTPUT
Exception occured: / by zero
end of the program 
 */