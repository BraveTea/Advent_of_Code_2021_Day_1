import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Sonar {

    int currentMeasurement;
    int previousMeasurement = 0;
    int count = -1; //Start at -1 because the code written now will see the first measurement as a raise in
    // measurement where it shouldn't because the first measurement doesn't have a previous


    File measurementsFile = new File("src/measurements.txt");
    Scanner inputFile = new Scanner(measurementsFile);

    File testFile = new File("src/testFile.txt");
    Scanner inputTestFile = new Scanner(testFile);

    Sonar() throws FileNotFoundException {
    }

    int runSonar() throws FileNotFoundException {


        while (inputFile.hasNext()) {
            currentMeasurement = Integer.parseInt(inputFile.next());
            if (currentMeasurement > previousMeasurement) {
                count += 1;
            }
            previousMeasurement = currentMeasurement;

        }

        return count;

    }


    ArrayList<Integer> windows = new ArrayList<>();

    int runSonarWindows(){

        ArrayList<Integer> allMeasurementsInList = new ArrayList<>();

        while (inputFile.hasNext()){
            allMeasurementsInList.add(Integer.parseInt(inputFile.next()));
        }
        System.out.println(allMeasurementsInList);
        System.out.println(allMeasurementsInList.size());

        for (int i = 0; i < allMeasurementsInList.size()-2; i++){
            int firstMeasurement = allMeasurementsInList.get(i);
            int secondMeasurement = allMeasurementsInList.get(i+1);
            int thirdMeasurement = allMeasurementsInList.get(i+2);
            windows.add(firstMeasurement + secondMeasurement + thirdMeasurement);
        }
        System.out.println(windows);
        return 0;
    }
}
