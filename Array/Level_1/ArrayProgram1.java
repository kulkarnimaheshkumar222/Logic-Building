import java.util.*;

 // 1. Input n and take n integers into an array; print them.

public class ArrayProgram1 {
    public static void main(String [] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int [] array = new int[size];

        System.out.println("Enter array elements");

        for(int i=0;i<size;i++) {
            int element = sc.nextInt();
            array[i] = element;
        }

        System.out.println("Array elements are");

        for(int i=0;i<size;i++) {
            System.out.print(array[i]+" ");
        }
    }
}