// break

//break statement: It is used to terminate the loop or switch statement. It is used to come out of the loop immediately.
public class j_24_break_statement {

    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){
        if(i==3){
            break;
        }
        System.out.println("hello "+i); //unreachable code
    }
}  
}
/* OUTPUT

hello 0
hello 1
hello 2

*/