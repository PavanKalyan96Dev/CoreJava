interface jetlees{
    public int sum(int a,int b);
}
class j_73_lambda{
    public static void main(String args[]){
        jetlees obj=(a,b)->{
            System.out.println("The value of a is "+a);
            System.out.println("The value of b is "+b);
            return (a+b);
        };
        System.out.println("The sum is "+obj.sum(10,20));
    }
}
/*OUTPUT
The value of a is 10
The value of b is 20
The sum is 30

*/