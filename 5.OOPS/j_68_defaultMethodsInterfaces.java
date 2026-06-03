//this is static method of interface


//default method in interface is used to provide the implementation of method in interface and it is introduced in java 8 version
interface salaar{
    default void display(){
        System.out.println("Used for Implementing default method of interface");
    }
}
class j_68_defaultMethodsInterfaces implements salaar{
    public static void main(String args[]){
        j_68_defaultMethodsInterfaces obj=new j_68_defaultMethodsInterfaces();
        obj.display();
    }
}
/*OUTPUT
Used for Implementing default method of interface
*/