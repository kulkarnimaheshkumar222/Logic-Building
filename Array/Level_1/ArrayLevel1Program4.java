import java.util.*;

// 4. Find the maximum element in an array.

public class ArrayLevel1Program4 {
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
        int result = getMaxElement(array);

        System.out.println("Maximum element in array is : "+result);
    }

    public static int getMaxElement(int [] array) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}