public class CopyExplanation {
    public static void main(String[] args) {
        // Example Arrays
        int[] shallowArray = {1, 2, 3};
        int[] deepArray = Arrays.copyOf(shallowArray, shallowArray.length);

        // Modify original array
        shallowArray[0] = 99;

        // Observe the effect on shallow vs. deep copy
        System.out.println("Shallow Array: " + Arrays.toString(shallowArray));
        System.out.println("Deep Array: " + Arrays.toString(deepArray));
    }
}