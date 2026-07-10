import java.util.*;

// 2. Count how many times a given element appears

public class ArrayLevel2Program2 {
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

        System.out.println("Enter element whose count should be calculated");
        int value = sc.nextInt();
        
        int result = countElement(array, value);
        System.out.println(value+" appears for "+result+" times");
    }
          
    public static int countElement(int [] array, int value) {
        int count = 0;
        for(int i=0;i<array.length;i++) {
            if (array[i] == value) {
               count++;
            }
        }
        return count;
    }
}