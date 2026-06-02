/*Flow Control
Flow control describes the order in which all the statements will be executed at run 
time. */


//if else


/* Flow control describes the order in which all the statements will be executed at run time.

The argument to the if statement should be Boolean by mistake if we are providing any other type we will get "compile time error". */
class j_18_If_Else {
    public static void main(String[] args) {

        //error 
        /*int age = 0;

        if (age) {
            System.out.println("Hello.");
        } else {
            System.out.println("Hi");
        }*/

//error
/* 
            int age = 20;
            if(age=30){
                System.out.println("Hello.");
            } else {
                System.out.println("Hi");
            }
                */
            //Correct way
            int age=20;
            if(age==30){
                System.out.println("Age is 30");
            }
            else
            {
                System.out.println("Age is not 30"); //Age is not 30
            }

    
            boolean b=false;
                if(b=true) //We are not comparing b with true but we are assigning true to b so it will always return true and it will print hello
                {
                    System.out.println("hello"); //hello
                    }else{
                System.out.println("hi");
                }
        
            //Comaparison Operator
            
            boolean car=false;
            if(car==true)
            {
                System.out.println("car is available");
            }
            else{
                System.out.println("Car is not available"); //car is not available
            }
            //Without curly braces we can take only one statement under if, but it should not be declarative statement.
            if(true){
                System.out.println("hello"); //hello
            }

                            
                if(true)

                    System.out.println("hello"); //Assumes this is inside the if block and it will print hello
                    System.out.println("hello"); //Assume this is outside the if block and it will print hello
                    

}
}
