public class j_34_default_access_modifier {

    int x = 20; // default access modifier is used when we do not specify
    // any access modifier for a variable, method or constructor.

    // default access modifier allows access only within the same package.
    // It is not accessible from outside the package.

    public void show() {
        System.out.println(x);
    }
}  

class DemoExample {

    public static void main(String[] args) {
        System.out.println("This is a default access modifier");

        j_34_default_access_modifier obj = new j_34_default_access_modifier();
        obj.show();
        System.out.println(obj.x);
    }
}
/*OUTPUT

This is a default access modifier
20
20

*/