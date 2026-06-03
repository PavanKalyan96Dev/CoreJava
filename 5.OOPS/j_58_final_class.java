//final class cannot be inherited
//final class cannot be inherited
public final class j_58_final_class {
    public void display(){
        System.out.println("This is a final class");
    }
}
class child extends j_58_final_class{
    // we cannot inherit the final class
    public void display(){
        System.out.println("Trying to inherit the final class");
    }
}
class finalClassExample{
    public static void main(String args[]){
        child obj=new child();
        obj.display();
    }
}