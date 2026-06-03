interface thala {
    public void display();
}
public class j_71_Lambda_Expression{
    public static void main(String args[]){
        thala obj=()->System.out.println("From the Lambda Expression");
        obj.display();
    }
}
/*Output
From the Lambda Expression
 */