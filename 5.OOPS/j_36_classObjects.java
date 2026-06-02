public class j_36_classObjects
{
    boolean isOn;

    // method to turn on the light
        void turnOn()
        {
            isOn = true;
            System.out.println("Light on? " + isOn);
        }
        void turnOff()
        {
            isOn=false;
            System.out.println("Light on? " + isOn);
        }

    public static void main(String[] args) 
    {
        
        // create an object of Lamp
        j_36_classObjects led = new j_36_classObjects();

        // access method using object
        led.turnOn();
        led.turnOff();
    }
}
/*OUTPUT 
Light on? true
Light on? false


*/