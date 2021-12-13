import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programme {

    public static void main(String[] args) throws FileNotFoundException {
        int currentMeasurement = 0;
        int previousMeasurement = 0;
        int count = -1; //Start at -1 because the code written now will see the first measurement as a raise in
                        // measurement where it shouldn't because the first measurement doesn't have a previous

        File measurementsFile = new File("src/measurements.txt");
        Scanner inputFile = new Scanner(measurementsFile);


        while (inputFile.hasNext()){
            currentMeasurement = Integer.valueOf(inputFile.next());
            if (currentMeasurement > previousMeasurement){
                count+=1;
            }
            previousMeasurement = currentMeasurement;

        }

        System.out.println(count);

        }
    }
}
