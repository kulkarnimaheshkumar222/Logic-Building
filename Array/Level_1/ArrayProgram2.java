import java.util.*;
// 2. Find the sum of all elements in an array.

public class ArrayProgram2 {
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
        int result = getSum(array);

        System.out.println("Sum of array element is: "+result);
    }

    public static int getSum(int [] array) {
        int sum = 0;
        for(int item: array) {
            sum = sum + item;
        }
        return sum;
    }
}