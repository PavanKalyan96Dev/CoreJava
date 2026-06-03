 //accessing the parent class method using the super keyword
public class j_54_super_method {
    public void display(){
        System.out.println("this is a parent class method:");
    }
}
class child extends j_54_super_method{
    public void display(){
        System.out.println("this is a child class method:");
        super.display();// calling the super class method from sub class.
    }
}
class supermethodExample{
    public static void main(String args[]){
        child obj=new child();
        obj.display();

    }
}
/*OUTPUT
this is a child class method:
this is a parent class method:
 */