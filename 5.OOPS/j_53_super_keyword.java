/*super keyword
Refers to the parent class object. It is used to call parent class method, 
access parent class variable and to call parent class constructor. 
It is a reference variable which is used to refer immediate parent class object. 

Accessing the parent class variable if the class and parent variables are same*/

public class j_53_super_keyword{

    int x=10;

}
class child extends j_53_super_keyword{
    int x=20;

    void display(){
        System.out.println("Value of x in child class: "+x);// refers the current class variable
        System.out.println("Value of x in parent class: "+super.x); //refers to the parent class variable
    }
}
class superKeywordExample{
    public static void main(String args[]){
    child obj=new child();
    obj.display();
    }
}
/*OUTPUT
Value of x in child class: 20
Value of x in parent class: 10
 */