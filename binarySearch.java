import java.util.Arrays;

public class binarySearch {

    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i ++) {
            array[i] = (int) (Math.random() * 10 + 1); 
        }
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
        System.out.println(binarySearchRecursive(array, 3, 0, 4));
    }
    public static boolean binarySearchRecursive(int[] array, int x, int left, int right) {
        if (left > right ) {
            return false;
        }
        int mid = left + ((right - left) / 2);
        if (x == array[mid]) {
            return true;
        }
        if (x < array[mid]) {
            return binarySearchRecursive(array, x, left, mid - 1);
        }
        else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }
}