import java.util.*;

// 8.Find the index of the maximum element.

public class ArrayProgram8 {
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
        
        System.out.println("Index of max element is "+ findIndexOfMaxElement(array));
    }

    public static int findIndexOfMaxElement(int [] array) {
        int maxElementIndex = 0;
        for(int i=1;i<array.length;i++) {
            if (array[i] > array[maxElementIndex]) {
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }
}