
interface A{

    public void show();
}
interface B{
    public void display();
}
class child implements A,B{
    public void show(){
        System.out.println("Implementing show method");
    }
    public void display(){
        System.out.println("Implementing display method");
    }
}
class j_65_InterfaceExample{
    public static void main(String args[]){
        child obj=new child();
        obj.show();
        obj.display();

    }
}
/*OUTPUT
Implementing show method
Implementing display method
 */