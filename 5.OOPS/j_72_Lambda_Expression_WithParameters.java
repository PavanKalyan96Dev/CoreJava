interface youth{
    public int sum(int a,int b);
}
class j_72_Lambda_Expression_WithParameters {
    public static void main(String args[]){
        youth obj=(a,b)->(a+b);
        System.out.println("The sum is "+obj.sum(10,20));
    }
}
/*OUTPUT
The sum is 30
 */