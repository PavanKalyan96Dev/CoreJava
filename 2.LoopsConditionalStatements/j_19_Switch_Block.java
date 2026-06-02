//Switch block

//Switch Block
/*If several options are available then it is not recommended to use if-else we should go 
for switch statement.Because it improves readability of the code. */

public class j_19_Switch_Block {
    public static void main(String[] args) {
        
        int day=3;
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday"); //Wednesday
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid number");

        }
    }
    
}



        /*Every case label should be "compile time constant" otherwise we will get compile time
error.

        int x=30;
        int y=20;
        switch(x)
        {
        case 10:
        System.out.println("10");
        case y:  //error
        System.out.println("20");

        }*/
    t
    /*
If we declare y as final we won't get any compile time error.
        final int y=20;
        switch(x)
        {
        case 10:
        System.out.println("10");
        case y:  //no error
        System.out.println("20");
        }
*/


 //With in the switch we can take the default any where, but it is convension to take default as last case.

        /*  int ab=0;
        switch(ab) 
        { 
        default:
        System.out.println("default");
        case 0: 
        System.out.println("0"); //0
        break;
        case 1:
        System.out.println("1");
        case 2: 
        System.out.println("2");*/