public class j_39_typesOfVariables {
// 1) Instance variable
    int instanceVar = 100;

    // 2) Static variable
    static int staticVar = 200;
    public void show() {

        // 3) Local variable
        int localVar = 300;

        System.out.println("Inside show() method:");
        System.out.println("Instance Variable = " + instanceVar);
        System.out.println("Static Variable   = " + staticVar);
        System.out.println("Local Variable    = " + localVar);
    }
    public static void main(String[] args) {

        // Creating object to access instance variable and non-static method
        j_39_typesOfVariables obj = new j_39_typesOfVariables();

        System.out.println("Inside main() method:");

        // Accessing instance variable using object
        System.out.println("Instance Variable = " + obj.instanceVar);

        // Accessing static variable directly
        System.out.println("Static Variable   = " + staticVar);

        // Local variable inside main()
        int mainLocalVar = 400;
        System.out.println("Local Variable in main = " + mainLocalVar);

        System.out.println();

        // Calling non-static method
        obj.show();
    }
}
/* output

Inside main() method:
Instance Variable = 100
Static Variable   = 200
Local Variable in main = 400

Inside show() method:
Instance Variable = 100
Static Variable   = 200
Local Variable    = 300

*/

