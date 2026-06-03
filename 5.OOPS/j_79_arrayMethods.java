import java.util.Arrays;
public class j_79_arrayMethods {

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("without toString method " +arr); //without toString method [I@8bcc55f
        // //toString method(): This method is used to print the array in a readable format.
        System.out.println("with toString method  "+Arrays.toString(arr)); //with toString method  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        //parallelSort method: This method is used to sort the array in parallel using multiple threads for better performance on larger arrays
        
        int[] arr2 = {8, 2, 6, 1, 9};
        Arrays.parallelSort(arr2);
        System.out.println("parallerl sorted"+Arrays.toString(arr2)); //parallerl sorted[1, 2, 6, 8, 9]

        //Arrays.fill method: This method is used to fill the array with a specific value.
        int arr3[]={0,0,0,00,0};
        Arrays.fill(arr3,100);
        System.out.println("filled array "+Arrays.toString(arr3)); //filled array [100, 100, 100, 100, 100]

        //This method creates a copy of the array.
        int arr4[]=Arrays.copyOf(arr,arr.length);
        System.out.println("copied array "+Arrays.toString(arr4)); //copied array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    }
}