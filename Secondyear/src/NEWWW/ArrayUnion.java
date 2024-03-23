/*Write a method that performs the union operation on two integer arrays, i.e. it will create 
a new array that has the values from the two input arrays but with no duplicates.
• The method must have the following signature:
public static int[] union(int[] a1, int[] a2)
• You can assume that no input array element will have a value less than 1.
• Your method can return an array that is the same size as the two input arrays put 
together. This will mean, in general, the returned array will have too many elements. 
This is fine. Any elements you don’t need, you simply set to zero.
• Implement this method using Java primitives only. You may use the array length 
property.
• If you want to implement other methods to help you, you may do so. You must write 
the method specified above, but you may write other methods to help you if you want 
to. You must show the full implementation of any methods you create, however.*/



package NEWWW;

import java.util.Arrays;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2 = {4, 5, 6, 7, 8};
        int[] result = union(a1, a2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] union(int[] a1, int[] a2) {
        int maxLength = Math.max(a1.length, a2.length);
        int[] unionArray = new int[maxLength * 2]; // Create a new array with enough capacity

        for (int i = 0; i < a1.length; i++) {
            int num = a1[i];
            if (num >= 1 && !contains(unionArray, num)) {
                unionArray[i] = num;
            }
        }

        for (int i = 0; i < a2.length; i++) {
            int num = a2[i];
            if (num >= 1 && !contains(unionArray, num)) {
                unionArray[a1.length + i] = num;
            }
        }

        return trimArray(unionArray);
    }

    private static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    private static int[] trimArray(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num != 0) {
                count++;
            }
        }
        int[] trimmedArray = new int[count];
        System.arraycopy(array, 0, trimmedArray, 0, count);
        return trimmedArray;
    }
}

