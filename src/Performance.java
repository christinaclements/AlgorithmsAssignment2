import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class Performance {
    public static void main(String[] args) throws IOException{
        SortingAlgorithm[] algorithms = {new InsertionSort(), new MergeSort(), new BubbleSort(),
        new QuickSort(), new SelectionSort(), new ShellSort()};
        try {
            File file = new File("Assignment2Report-K.txt");
            file.createNewFile();
        } catch (IOException e){
            System.out.println("Error");
            System.exit(3);
        }
        FileWriter writer = new FileWriter("Assignment2Report-K.txt");

        for (int i = 0; i < algorithms.length; i++){
            writer.write("Sorting algorithms - "+ algorithms[i].getName());
            Tester tester = new Tester(algorithms[i]);
            writer.write("\n"+ tester.test(20, 100));
            writer.write("\n"+ tester.test(20, 500));
            writer.write("\n"+ tester.test(20, 1000));
            writer.write("\n"+ tester.test(20, 2000));
            writer.write("\n"+ tester.test(20, 5000));
            writer.write("\n"+ tester.test(20, 10000));
            writer.write("\n"+ tester.test(20, 20000));
            writer.write("\n"+ tester.test(20, 75000));
            writer.write("\n"+ tester.test(20, 150000));
            writer.write("\n");
            writer.write("\n");
            System.out.println(algorithms[i].getName() + " done.");
        }
        writer.close();
    }
}
