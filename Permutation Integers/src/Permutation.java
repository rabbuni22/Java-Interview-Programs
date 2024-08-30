
	import java.util.Arrays;

	public class Permutation {
	    
	    // Method to print the array
	    private static void printArray(int[] array) {
	        System.out.println(Arrays.toString(array));
	    }

	    // Recursive method to generate permutations
	    private static void generatePermutations(int[] array, int currentIndex) {
	        // Base case: if currentIndex is at the end of the array
	        if (currentIndex == array.length - 1) {
	            printArray(array);
	            return;
	        }

	        // Permutations made by fixing the current element
	        for (int i = currentIndex; i < array.length; i++) {
	            swap(array, currentIndex, i);  // Swap the elements
	           generatePermutations(array, currentIndex + 1);  // Recursion
	            swap(array, currentIndex, i);  // Backtrack (undo the swap)
	        }
	    }

	    // Method to swap two elements in the array
	    private static void swap(int[] array, int i, int j) {
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	    }

	    public static void main(String[] args) {
	        int[] array = {1,2,3};  // Example array
	        generatePermutations(array, 0);
	    }
	}



