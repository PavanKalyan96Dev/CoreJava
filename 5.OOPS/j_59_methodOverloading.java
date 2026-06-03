//METHOD OVERLOADING
//Method overloading means having multiple methods with the same name but different parameters.\
public class j_59_methodOverloading
{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
}
class methodOverloading{
    public static void main(String args[]){
        j_59_methodOverloading obj = new j_59_methodOverloading();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10, 20, 30, 40));
    }
}
/*OUTPUT
30
60
100
 */