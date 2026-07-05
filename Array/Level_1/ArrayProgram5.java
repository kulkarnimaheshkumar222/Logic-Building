import java.util.*;

// 5. Find the minimum element in an array.

public class ArrayProgram5 {
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
        int result = getMinElement(array);

        System.out.println("Minimum element in array is : "+result);
    }

    public static int getMinElement(int [] array) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}