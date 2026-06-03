abstract  class j_61_abstraction {
    public abstract void bark(); //abstract method: a method without a body and it must be implemented by the subclass.
    public void eat()//concrete method: a method with a body and it can be inherited by the subclass.
    {
        System.out.println("Animal is eating");
    }

}
class child extends j_61_abstraction{
    public void bark() //parent class abstract methood is implemented in the child class
    {
        System.out.println("Dog is barking");
    }
}

class abstractionExample{
    public static void main(String args[]){
        child obj=new child();
        obj.bark();
        obj.eat();
    }
}
/*OUTPUT
Dog is barking
Animal is eating
 */