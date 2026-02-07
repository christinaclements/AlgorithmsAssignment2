import java.util.Random;

public class Tester {
    SortingAlgorithm sa;
    Random random;
    public Tester(SortingAlgorithm sa){
        this.sa = sa;
        this.random = new Random();
    }
    double singleTest(int size){
        int[] arr = new int[size];
     //   int[] arr = generateKSorted(size);
     // random array sorting performance testing code
        for (int i = 0; i < size; i++){
           arr[i] = random.nextInt(10000);
        }
        long start = System.nanoTime();
        sa.sorty(arr);
        long end = System.nanoTime();
        return (double) ((end-start)/1000000);
    }
    public String test( int iterations, int size){
        double totalTime = 0;
        for (int i = 0; i < iterations; i++){
            double time = singleTest(size);
            totalTime += time;
        }
        double average = totalTime / iterations;
        return "Sorted "+size+" elements in "+average+" ms (avg)";
    }
    int[] generateKSorted(int size){
        int[] arr = new int[size];
        //create sorted array
        for (int i = 0; i < size; i++){
            arr[i] = i;
        }
            for (int i = 0; i < size; i++){
                //k = 10 but not out of bounds
                int maxDistance = Math.min(10, size - i - 1);
                int swapDist = random.nextInt(maxDistance + 1);
                int swapIndex = i + swapDist;
                //swap
                int temp = arr[i];
                arr[i] = arr[swapIndex];
                arr[swapIndex] = temp;
            }
        return arr;
    }
}
