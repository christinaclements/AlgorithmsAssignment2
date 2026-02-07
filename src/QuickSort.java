public class QuickSort implements SortingAlgorithm{
    String name = "Quick Sort";
    public int[] sorty(int[] input) {
        if (input == null || input.length <= 1) {
            return input;
        }
        quickSort(input, 0, input.length - 1);
        return input;
    }
    private static void quickSort(int[] input, int left, int right){
        int index = partition(input, left, right);
        if (left < index - 1){
            quickSort(input, left, index - 1);
        }
        if (index < right){
            quickSort(input, index, right);
        }
    }
    private static int partition(int[] input, int left, int right){
        int pivot = input[(left + right) / 2];
        while (left <= right){
            int temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            left++;
            right--;
        }
        return left;
    }
    public String getName(){
        return name;
    }
}
