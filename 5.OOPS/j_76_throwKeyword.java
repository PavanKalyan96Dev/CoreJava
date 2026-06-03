 //THROW KEYWORD
 class j_76_throwKeyword{
    public static void main(String args[]){
        int age=14;
        if(age<18) throw new ArithmeticException("Your are not eligible to vote");
        else{

            System.out.println("You are eligible to vote");
        }
    }
}
/*OUTPUT
Exception in thread "main" java.lang.ArithmeticException: Your are not eligible to vote
        at j_76_throwKeyword.main(j_76_throwKeyword.java:4)
 */