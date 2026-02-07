public class SelectionSort implements SortingAlgorithm{
    String name = "Selection Sort";
    public int[] sorty(int[] input) {
        if (input == null || input.length == 0) {
            return input;
        }
        int n = input.length;

        for (int i = 0; i < n -1; i++){
            int minIndex = i;

            for (int j = i + 1; j < n; j++){
                if (input[j] < input[minIndex]){
                    minIndex = j;
                }
            }
            int temp= input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }
        return input;
    }
    public String getName(){
        return name;
    }
}
