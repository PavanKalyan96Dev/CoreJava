//static methods in interfaces
interface demo{
    static void display(){
        System.out.println("this is static method of interface");
    }
}
class j_67_staticInterfaceMethods{
    public static void main(String args[]){
        demo.display();//calling the static method by using the class name 
    }
}