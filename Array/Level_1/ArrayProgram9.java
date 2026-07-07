import java.util.*;

// 9. Find the index of the maximum element.

public class ArrayProgram9 {
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
        
        System.out.println("Index of min element is "+ findIndexOfMinElement(array));
    }

    public static int findIndexOfMinElement(int [] array) {
        int minElementIndex = 0;
        for(int i=1;i<array.length;i++) {
            if (array[i] < array[minElementIndex]) {
                minElementIndex = i;
            }
        }
        return minElementIndex;
    }
}