// Array class methods

public class j_31_array_methods {

    public static void main(String[] args) {
        int a[]=new int[5];
        System.out.println("size of the array is :"+a.length); //5
        // we can not change the size of the array once it is created but we can change the values of the array elements.
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        System.out.println("array elements are :");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]); //accessing values of the array elements by using for loop
        }

        a[2]=10000;
        System.out.println("a[2] value is: "+a[2]); //10000
        
         //enhanced for each loop
        for(int x:a){
                System.err.println("array elements are : "+x);
        }
        /* Output

        array elements are : 10
        array elements are : 20
        array elements are : 10000
        array elements are : 40
        array elements are : 50
        
        */

       
        //sort arrays
        Arrays.sort(a);
         for(int x:a){
                System.err.println(x);
        }
        /* output
        10
        20
        40
        50
        10000
        */

    
        //compare arrays by using the equals() method

        int c []={10,20,30,40,50};
        int d []={10,20,30,40,50};
        System.out.println(Arrays.equals(c,d));// returns true because both arrays have same elements in the same order

        //binary search method
        int e []={10,20,30,40,50};
        System.out.println(Arrays.binarySearch(e,30)); //2 because 30 is present at index 2 in the array


     //toString method:it is used to convert the array into a string representation.
        System.out.println(Arrays.toString(c));
        /* output
        [10, 20, 30, 40, 50]
        */

    }
    
}
