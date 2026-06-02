public class j_45_Parametrized_Constructor 
{
    String name;
    int age;
    j_45_Parametrized_Constructor(String names,int ages)
    {
        name=names;
        age=ages;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String args[]){
        j_45_Parametrized_Constructor obj=new j_45_Parametrized_Constructor("pavan",24);
        obj.display();
    }
}
/*OUTPUT

Pavan Kalyan
100

*/