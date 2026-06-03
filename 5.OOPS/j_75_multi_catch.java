


 //Multi Catch exception
 public class j_75_multi_catch{
    public static void main(String args[]){
        int numerator=10;
        int denominator=0;
        int arr[]=new int[5];

        try{
            int result=numerator/denominator;
            System.out.println("result is:"+result);
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
/*output
/ by zero
 */