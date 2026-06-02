
//Hierachiral Inheritance
public class j_51_Hierachiral_Inheritance {
    j_51_Hierachiral_Inheritance()
    {
        System.out.println("This is parent class constructor");
    }

}
class child1 extends j_51_Hierachiral_Inheritance
{
    child1()
    {
        System.out.println("This is child1 class constructor");
    }
}
class child2 extends j_51_Hierachiral_Inheritance
{
    child2(){
        System.out.println("This is child2 class constructor");
    }
}
class hierachiralExample{
    public static void main(String args[]){
        new child1();
        new child2();
    }
}
/*OUTPUT
This is parent class constructor
This is child1 class constructor
This is parent class constructor
This is child2 class constructor
 */