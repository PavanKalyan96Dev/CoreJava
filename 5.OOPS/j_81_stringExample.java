 class j_81_stringExample{
    public static void main(String args[]){
        String str="pavan Kalyan"; //created object1 
        System.out.println("Name is: "+str);
        str="Pawan Kalyan is a great actor"; //created object 2
        System.out.println("Name is: "+str);
        //object1 and object 2 are created in string pool and they are immutable objects
        //str variable points to the newly creared object 2 and the object 1 is eligible for garbage collection
        //Concat
        str.concat(" and politician"); //not modified but created new object 3 and str variable is still pointing to object 2
        System.out.println(str); //str is still pointing to object 2 and object 3 is eligible for garbage collection

        //Everytime we try to change the string a new object is created and memory also wasted
    //so stringBuffer came into picture which is mutable and it will not create new object for every change in the string
        
        StringBuffer sb=new StringBuffer("pawan is a great actor"); //created object 4 in heap memory
        sb.append(" and politician"); //modified the same object 4 and no new object is created
        System.out.println("with the string buffer: "+sb);

        StringBuilder sb1=new StringBuilder("Janasena is a great party");
        sb1.append(" and pavan kalyan is the leader of it");
        System.out.println("with the string builder: "+sb1);


    }
}
/*OUTPUT

Name is: pavan Kalyan
Name is: Pawan Kalyan is a great actor
Pawan Kalyan is a great actor
with the string buffer: pawan is a great actor and politician
with the string builder: Janasena is a great party and pavan kalyan is the leader of it
*/