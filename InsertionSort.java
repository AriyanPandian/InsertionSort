import java.util.Arrays;

public class InsertionSort {
    
    public static void insertionSort(int[] arr) {
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println();
        
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            System.out.println("Step " + i + ": Inserting element " + key + " into sorted portion");
            System.out.println("Sorted portion: " + Arrays.toString(Arrays.copyOfRange(arr, 0, i)));
            System.out.println("Unsorted portion: " + Arrays.toString(Arrays.copyOfRange(arr, i, arr.length)));
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                System.out.println("  Shifting " + arr[j + 1] + " to position " + (j + 2));
            }
            
            arr[j + 1] = key;
            System.out.println("  Inserted " + key + " at position " + (j + 1));
            System.out.println("Array after step " + i + ": " + Arrays.toString(arr));
            System.out.println();
        }
        
        System.out.println("Final sorted array: " + Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("=== Insertion Sort Algorithm Demonstration ===");
        System.out.println("The algorithm builds the sorted array by repeatedly inserting");
        System.out.println("elements from the unsorted portion into their correct positions");
        System.out.println("within the sorted portion.");
        System.out.println();
        
        insertionSort(arr);
    }
}
