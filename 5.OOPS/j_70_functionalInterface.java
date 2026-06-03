@FunctionalInterface
interface csk{
    void rr();
}
public class j_70_functionalInterface{
    csk obj=new csk(){
        public void rr(){
            System.out.println("This is functional interface");
        }
    };
}
/* output
This is functional interface 
*/