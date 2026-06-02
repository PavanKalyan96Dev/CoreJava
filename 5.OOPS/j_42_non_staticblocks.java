
public class j_42_non_staticblocks {
    
    int og=1000;

    public void display(){
        System.out.println("This is a non static method from the display method");
        System.out.println(og);
    }
}
class nonStaticExample{
    public static void main(String args[]){
        j_42_non_staticblocks obj = new j_42_non_staticblocks();
        //access non static method by using the object of the class because non static members can be accessed only by using the object of the class.
        obj.display();
        //accessing the non static variable by using the object of the class because non static members can be accessed only by using the object of the class
        System.out.println(obj.og);

    }
}
/* OUTPUT

This is a non static method from the display method
1000
1000



*/