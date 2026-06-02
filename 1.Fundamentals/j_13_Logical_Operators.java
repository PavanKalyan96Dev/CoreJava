
 /*Logical Operators

Logical operators are used to combine multiple conditions (boolean expressions) and return a boolean result (true or false).

x&&y : y will be evaluated if and only if x is true.(If x is false then y won't be evaluated 
i.e., If x is ture then only y will be evaluated)

x||y : y will be evaluated if and only if x is false.(If x is true then y won't be evaluated i.e., 
If x is false then only y will be evaluated)


*/
public class j_13_Logical_Operators {
    public static void main(String[] args) {

            int x=10 , y=15 ;
            if(++x < 10  ||  ++y > 15) {    //instead of || using  &,&&, |

                x++;
            }
            else
            {
                y++;
            }
            System.out.println("x: " + x); // Output: 12
            System.out.println("y: " + y); // Output: 16
            
    }
    
}

