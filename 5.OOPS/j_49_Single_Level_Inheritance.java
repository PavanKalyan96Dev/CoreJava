/*
In single inheritance, a sub-class is derived from only one super class.
It inherits the properties and behavior of a single-parent class.
 Sometimes, it is also known as simple inheritance */

public class j_49_Single_Level_Inheritance //parent class or super class
{

    int salary=1000;
    public void display()
    {
        System.out.println("This is parent class method");
    }
    
}
class child extends j_49_Single_Level_Inheritance //child class or sub class
{
    public void show()
    {
        System.out.println("This is child class method");
    }
}
class singleLevelExample  //main class
{
    public static void main(String args[])
    {
        child obj=new child();
        obj.show();
        obj.display();
        System.out.println("The salary is "+obj.salary);
    }
}
/*OUTPUT
This is child class method
This is parent class method
The salary is 1000

*/