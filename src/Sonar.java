import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Sonar {

    int currentMeasurement;
    int previousMeasurement = 0;
    int count = -1; //Start at -1 because the code written now will see the first measurement as a raise in
    // measurement where it shouldn't because the first measurement doesn't have a previous





    Sonar() {
    }

    int runSonar() throws FileNotFoundException {
        File measurementsFile = new File("src/measurements.txt");
        Scanner inputFile = new Scanner(measurementsFile);

        while (inputFile.hasNext()) {
            currentMeasurement = Integer.parseInt(inputFile.next());
            if (currentMeasurement > previousMeasurement) {
                count += 1;
            }
            previousMeasurement = currentMeasurement;

        }
        inputFile.close();
        return count;

    }


    ArrayList<Integer> windows = new ArrayList<>();

    int runSonarWindows() throws FileNotFoundException {

        File measurementsFile = new File("src/measurements.txt");
        Scanner inputFile = new Scanner(measurementsFile);
        ArrayList<Integer> allMeasurementsInList = new ArrayList<>();

        while (inputFile.hasNext()){
            allMeasurementsInList.add(Integer.parseInt(inputFile.next()));
        }

        for (int i = 0; i < allMeasurementsInList.size()-2; i++){
            int firstMeasurement = allMeasurementsInList.get(i);
            int secondMeasurement = allMeasurementsInList.get(i+1);
            int thirdMeasurement = allMeasurementsInList.get(i+2);
            windows.add(firstMeasurement + secondMeasurement + thirdMeasurement);
        }

        int curNum;
        int prevNum = 0;
        int counter2 = -1;

        for (int num : windows){
            curNum = num;
            if (curNum > prevNum){
                counter2 += 1;
            }
            prevNum = curNum;
        }
        inputFile.close();
        return counter2;
    }
}
