
public class SelectionSort {

    public static void main(String[] args) {
        
    }

    public static int[] selectionSort(int[] arr) {
        int currentMinIndex;

        for (int i = 0; i < arr.length; i ++ ) {
            currentMinIndex = i;
            for (int j = i + 1; j < arr.length; j ++) {

                if (currentMinIndex > j) {
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
            
            }


        }
        return arr;
    }

}