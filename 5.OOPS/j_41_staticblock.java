public class j_41_staticblock {
    public static int dragon=2000;
    public static void display()
    {

        System.out.println("dragon value is :"+dragon);

    }
class staticblockExample{
    public static void main(String args[]){
        j_41_staticblock.display(); //accessing static method direcly by using the class name without creating an object of the class because static members can be accessed directly by using the class name.
        System.out.println("from the main method "+j_41_staticblock.dragon); //accessing the static variable directly by using the class name without creating an object of the class because static members can be accessed directly by using the class name.
        

    }
}
}
/*  output

dragon value is :2000
from the main method 2000



*/