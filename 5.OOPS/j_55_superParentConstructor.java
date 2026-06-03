// calling the parent class constructor using the super keyword
public class j_55_superParentConstructor {
    j_55_superParentConstructor(){
        System.out.println("This is parent class constructor");
    }
}
class child extends j_55_superParentConstructor{
    child(){
        super();
        System.out.println("This is child class constructor");
    }
}
class superParentConstructorExample{
    public static void main(String args[]){
        new child();
    }
}
/*OUTPUT
This is parent class constructor
This is child class constructor
 */