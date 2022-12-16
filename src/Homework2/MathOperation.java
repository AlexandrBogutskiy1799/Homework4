package Homework2;

import java.util.Arrays;

/**
 * ЗАДАНИЕ 1
 * Create class MathOperation wich contains main method.
 * Input: int array with size = 10. Calculate:
 * sum
 * min/max
 * max positive
 * multiplication
 * modulus of first and last element
 * second largest element
 * <p>
 * As a result you should have methods with following names :
 * <p>
 * sum(int array[])
 * min(int array[])
 * max(int array[])
 * maxPositive(int array[])
 * multiplication  (int array[])
 * modulus(int array[])
 * secondLargest(int array[])
 */
public class MathOperation {


    public static void main(String[] args) {
        int[] array = {2, 15, 1, 25, 65, 77, 11, 37, 13, 2};

        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("int array with size = 10. Calculate: ");
        System.out.println("sum of elements is "+ sum(array));
        minMax(array);
        maxPositive(array);
        multiplication(array);
        secondLargestElement(array);


    }

    private static int sum(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    private static void minMax(int[] array) {
        Arrays.sort(array);
        System.out.println("min element is " + array[0]);
        System.out.println("max element is " + array[array.length - 1]);

    }

    private static void maxPositive(int[] array) {
        Arrays.sort(array);
        System.out.println("max positive digit is " + array[array.length - 1]);
    }

    public static void multiplication(int[] array) {
        long result = 1;
        for (int i = 0; i < array.length; i++) {
            result = result * array[i];

            System.out.println("multiplication "+result);
        }

    }

    private static void secondLargestElement(int[] array) {
        Arrays.sort(array);
        System.out.println("The second largest element is " + array[array.length - 2]);
    }
}
