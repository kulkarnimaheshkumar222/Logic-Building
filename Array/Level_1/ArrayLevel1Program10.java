import java.util.*;

// 10. Take n elements and print only those greater than a given value k.

public class ArrayLevel1Program10 {
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

        System.out.println("Enter element whose value should be compared while printing array");
        int value = sc.nextInt();
        displayElements(array,value);
    
    }
          
    public static void displayElements(int [] array, int value) {
        for(int i=0;i<array.length;i++) {
            if (array[i] > value) {
                System.out.print(array[i]+" ");
            }
        }
    }
}