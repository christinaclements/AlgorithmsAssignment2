public class BubbleSort implements SortingAlgorithm{
    String name = "Bubble Sort";
    public int[] sorty(int[] input) {
        if (input == null || input.length == 0) {
            return input;
        }
        int n = input.length;

        for (int i = 0; i < n-1; i++){

            for (int j = 0; j < n - i - 1; j++){
                //compare adjacent elements, swap if needed
                if (input[j] > input[j + 1]){
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }
    public String getName(){
        return name;
    }
}