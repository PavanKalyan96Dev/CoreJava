
@FunctionalInterface
interface dragon{
    void display();
    //void show(); if we declare more than one abstract method in functional interface then it will return an error
    // because functional interface can have only one abstract method  
    default void show(){
        System.out.println("This is default method of functional interface");
    }
    static void display1(){
        System.out.println("This is static method of functional interface");
    }
    //MULTIPLE DEFAULT AND STATIC METHODS ARE ALLOWED IN FUNCTIONAL INTERFACE BUT ONLY ONE ABSTRACT METHOD IS ALLOWED IN FUNCTIONAL INTERFACE
}
class child implements dragon{
    public void display(){
        System.out.println("This is display method of child class");
    }
}
class j_69_FunctionalInterface{
    public static void main(String args[]){
        child obj=new child();
        obj.display();
        obj.show();
        dragon.display1();
    }
}
/*OUTPUT
This is display method of child class
This is default method of functional interface
This is static method of functional interface
*/