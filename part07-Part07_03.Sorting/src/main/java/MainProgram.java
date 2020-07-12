
import java.util.Arrays;


public class MainProgram {

    public static int smallest(int[] array){
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        return indexOfSmallestFrom(array, 0);
    }    
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int index = startIndex;
        int smallest = table[index];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                index = i;
                smallest = table[index];
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int val1 = array[index1];
        array[index1] = array[index2];
        array[index2] = val1;
    }
    
    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length - 1; i++) {
            swap (array, i, indexOfSmallestFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }    
    
    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }

}
