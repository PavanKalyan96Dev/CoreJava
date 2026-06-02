/*The this keyword refers to the current object in a method or constructor.

The most common use of the this keyword is to eliminate the confusion between class
attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).

this can also be used to:

Invoke current class constructor
Invoke current class method
Return the current class object
Pass an argument in the method call
Pass an argument in the constructor call
 */

public class j_47_this_keyword{
    String name;
    int age;
    j_47_this_keyword(String name,int age)
    {
        this.name=name; //this is used to refer to the current object and to differentiate between the class attribute and the parameter with the same name.
        this.age=age; 
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String args[]){
        j_47_this_keyword obj=new j_47_this_keyword("pavan",24);
        obj.display();
    }
}
/*OUTPUT

pavan
24

*/