import java.util.*;

// 7.Count how many elements are even and odd.

public class ArrayProgram7 {
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
        
        System.out.println("Even elements in array are: "+countEvenElements(array)+",odd elements are: "+countOddElements(array));
    }

    public static int countEvenElements(int [] array) {
        int count = 0;
        for(int i=0;i<array.length;i++) {
            if (array[i]%2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countOddElements(int [] array) {
        int count = 0;
        for(int i=0;i<array.length;i++) {
            if (array[i]%2 != 0) {
                count++;
            }
        }
        return count;
    }
}