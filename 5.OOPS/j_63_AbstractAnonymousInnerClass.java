abstract  class j_63_AbstractAnonymousInnerClass {
    abstract void display();
    abstract void show();
}
class AbstractAnonymous{
    public static void main(String args[]){
        j_63_AbstractAnonymousInnerClass obj = new j_63_AbstractAnonymousInnerClass() {
            public void display(){
                System.out.println("Implmeneting display method");
            }
            public void show(){
                System.out.println("Implementing show method");
            }
    };
        obj.display();
        obj.show();
    }
}