//Multi Level Inheritance

public class j_50_MultiLevel_Inheritance {
    int salary=1000;
    public void display()
    {
        System.out.println("This is parent class method");
    }
    
}
class child extends j_50_MultiLevel_Inheritance
{
    public void show()
    {
        System.out.println("This is child class method");
    }
}
class grandChild extends child
{
    public void print()
    {
        System.out.println("This is grand child class method");
    }
}
class mulitLevelExample{
    public static void main(String args[]){

        grandChild obj=new grandChild();
        obj.print();
        obj.show();
        obj.display();
        System.out.println("The salary is "+obj.salary);
    }
}
/*OUTPUT
This is grand child class method
This is child class method
This is parent class method
The salary is 1000
*/