class j_6_Arithmetic_Operators {
    public static void main(String args[]){

        byte a=10;
        byte b=20;
        
        System.out.println("byte + byte = " + a+b); // Output: 30
        short c=15;
        System.out.println("byte + short = " + a+c); // Output: 25
        
        short d=20;
        System.out.println("short + short = " + c+d); // Output: 35

        long e=100L;
        System.out.println("short + long = " + c+e); // Output: 120

        char f='A';
        char g='B';
        System.out.println("char + char = " + f+g); // Output: AB

    }
}

/*  output

byte + byte = 1020
byte + short = 1015
short + short = 1520
short + long = 15100
char + char = AB

*/