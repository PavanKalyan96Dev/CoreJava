//An interface is a blueprint of a class that contains method declarations (no implementation).
public interface j_64_Interfaces
{
    public void show();
    public void display();
}
class child implements j_64_Interfaces{
    public void show(){
        System.out.println("Implementing show method");
    }
    public void display(){
        System.out.println("Implementing display method");
    }
}
class InterfacesExample{
    public static void main(String args[]){
        child obj=new child();
        obj.show();
        obj.display();

    }
}
/*Output
Implementing show method
Implementing display method

*/