 //ENCAPSULATION
 /* Encapsulation: wrapping up data and code together into a single unit is called encapsulation. 
                    It is one of the fundamental OOPS concepts. It is achieved by using access modifiers.
                    The main purpose of encapsulation is to protect the data from unauthorized access and modification.
                    It also helps in achieving data hiding. 
                    In encapsulation, we can make the variables private and provide public getter and setter methods to access and modify the variables.*/
public class j_60_Encapsulation {

    private int id;
    private String name;
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
class EncapsulationExample{
    public static void main(String args[]){
        j_60_Encapsulation obj=new j_60_Encapsulation();
        obj.setId(100);
        obj.setName("Pavan Kalyan");
        System.out.println("Id: "+obj.getId());
        System.out.println("Name: "+obj.getName());
    }
}
/*OUTPUT
Id: 100
Name: Pavan Kalyan
 */