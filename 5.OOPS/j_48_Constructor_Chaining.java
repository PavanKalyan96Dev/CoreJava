
public class j_48_Constructor_Chaining {

        j_48_Constructor_Chaining() //2
        {
            this(10);//3
            System.out.println("This is a default constructor");//9
        }
        j_48_Constructor_Chaining(int x) //4
        {
            this(10,20);//5
            System.out.println("This is a parameterized constructor with one parameter: " + x);//8
        }
        j_48_Constructor_Chaining(int x,int y) //6
        {
            System.out.println("This is a parameterized constructor with two parameters: " + x + " and " + y);//7
        }
        public static void main(String args[]){
                new j_48_Constructor_Chaining(); //1
        } 
}
/*OUTPUT
This is a parameterized constructor with two parameters: 10 and 20
This is a parameterized constructor with one parameter: 10
This is a default constructor
 */