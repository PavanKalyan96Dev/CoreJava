
 public class j_66_Override 
{
    public void display(){
        System.out.println("This is override method of parent class");
    }
}
class child extends j_66_Override{
    @Override
    public void display(){
        System.out.println("This is override method of child class");
    }
    public void show(){
        System.out.println("This is show method of child class");
    }
}
class OverrideExample{
    public static void main(String args[]){
       /*output1 
       j_66_Override obj=new child(); //displays the method which exist in the parent class
        obj.display();
        obj.show(); //returns an error because the reference variable is of parent class and show method is not present in parent class */

        child obj=new child();
        obj.display();
        obj.show(); //output 2
        
    }
}
/* OUTPUT1
j_66_Override.java:20: error: cannot find symbol
        obj.show();
           ^
  symbol:   method show()
  location: variable obj of type j_66_Override



OUTPUT2
This is override method of child class
This is show method of child class

*/