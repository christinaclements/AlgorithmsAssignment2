public class MergeSort implements SortingAlgorithm{
    String name = "Merge Sort";
    public int[] sorty(int[] input) {
        if (input == null || input.length <= 1) {
            return input;
        }
        int mid = input.length / 2;
        int[] left = new int[mid];
        int[] right = new int[input.length - mid];
        for (int i = 0; i < mid; i++){
            left[i] = input[i];
        }
        for (int i = mid; i < input.length; i++){
            right[i - mid] = input[i];
        }
        left = sorty(left);
        right = sorty(right);
        return merge(left, right);
    }
    private static int[] merge(int[] left, int[] right){
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if (left[i] < right[j]){
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length){
            merged[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }
    public String getName(){
        return name;
    }
}
