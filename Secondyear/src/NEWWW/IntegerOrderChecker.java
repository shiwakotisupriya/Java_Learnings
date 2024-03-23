/*Create a program that accepts five integers as arguments via the command line. 
The program should then check if the five integers were given in ascending or 
descending order. If the integers are in either ascending or descending order the 
program should output the range of the integers (i.e. the difference between the 
lowest and highest values) and their mean value. If the integers are in neither 
ascending or descending order, the program should output a message to that 
effect and not output the range and mean value. For this exercise, two or more 
numbers that are equal are in both ascending and descending order.*/

package NEWWW;

public class IntegerOrderChecker {
    public static void main(String[] args) {
        if (args.length != 5) {
            System.out.println("Error: Please provide five integers as command-line arguments.");
            return;
        }

        int[] numbers = new int[5];
        for (int i = 0; i < args.length; i++) {
            try {
                numbers[i] = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid integer provided: " + args[i]);
                return;
            }
        }

        if (isAscending(numbers)) {
            System.out.println("Numbers are in ascending order.");
            calculateRangeAndMean(numbers);
        } else if (isDescending(numbers)) {
            System.out.println("Numbers are in descending order.");
            calculateRangeAndMean(numbers);
        } else {
            System.out.println("Numbers are not in ascending or descending order.");
        }
    }

    private static boolean isAscending(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDescending(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static void calculateRangeAndMean(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            sum += numbers[i];
        }

        int range = max - min;
        double mean = (double) sum / numbers.length;

        System.out.println("Range: " + range);
        System.out.println("Mean: " + mean);
    }
}
