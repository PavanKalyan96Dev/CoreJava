// continue
//We can use continue statement to skip current iteration and continue for the next iteration. 
public class j_25_continue_statement {
    public static void main(String args[]){

        for(int i=0;i<5;i++)
        {
            if(i==2)
            {
                continue;
            }
        System.out.println("hello "+i);

        }
    }
    
}
/* OUTPUT

hello 0
hello 1
hello 3
hello 4

*/

/*We can use continue only inside loops if we are using anywhere else we will get compile time error saying "continue outside of loop". 

          for(int j=0;j<5;j++)
        {
            if(j==2)
            {
            }
            continue;
        System.out.println("hello "+j); // error: continue outside of loop


        }*/