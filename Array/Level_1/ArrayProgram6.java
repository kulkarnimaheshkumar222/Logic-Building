import java.util.*;

// 6.Count how many elements are positive, negative, or zero.

public class ArrayProgram6 {
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
        
        System.out.println("Positive elements in array are: "+getPositiveElements(array)+",Negative elements are: "+getNegativeElements(array)+" and zeros are: "+countZeros(
            array));
    }

    public static int getPositiveElements(int [] array) {
        int count = 0;
        for(int i=0;i<array.length;i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countZeros(int [] array) {
        int count = 0;
        for(int i=0;i<array.length;i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        return count;
    }

    public static int getNegativeElements(int [] array) {
        int count = 0;
        for(int i=0;i<array.length;i++) {
            if (array[i] < 0) {
                count++;
            }
        }
        return count;
    }
}