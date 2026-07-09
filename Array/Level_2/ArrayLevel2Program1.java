import java.util.*;

 // 1. Input an element x — check if it exists in the array.

public class ArrayLevel2Program1 {
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
        System.out.println("Enter element to search");
        int element = sc.nextInt(); 

        boolean result = isElementExist(array, element);
        System.out.println(result ? "Element exists in the array." : "Element does not exist in the array.");
    }

    public static boolean isElementExist(int [] array, int element) {
        for(int item : array) {
            if(item == element) {
                return true;
            }
        }
        return false;
    }
}