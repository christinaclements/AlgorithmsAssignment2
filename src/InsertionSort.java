public class InsertionSort implements SortingAlgorithm{
    String name = "Insertion Sort";
    public int[] sorty(int[] input) {
        if (input == null || input.length == 0) {
            return input;
        }
        int n = input.length;

        for (int i = 1; i < n; i++){
            int key = input[i];
            int j = i - 1;

            while (j >= 0 && input[j] > key){
                input[j + 1]=input[j];
                j--;
            }
            input[j+1]= key;
        }
        return input;
    }
    public String getName(){
        return name;
    }
}
