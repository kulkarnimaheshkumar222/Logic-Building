import java.util.*;

// 3. Find the average of array elements.

public class ArrayLevel1Program3 {
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
        double result = getAverage(array);

        System.out.println("Average of array element is : "+result);
    }

    public static double getAverage(int [] array) {
        int sum = 0;
        for(int item: array) {
            sum = sum + item;
        }
        double avg = (double) sum/(array.length);
        return avg;
    }
}