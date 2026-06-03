// final method cannot be overriden
public class j_57_final_method {
    public final void display(){
        System.out.println("Final method cannot be overriden");
    } 
}
class child extends j_57_final_method{
    //public void display()// we cannot override the final method
    {
        System.out.println("Trying to override the final method");
    }
}
class finalmethodExample{
    public static void main(String args[]){
    child obj=new child();
    obj.display();
}
}
/*OUTPUT
Trying to override the final method
Final method cannot be overriden
 */