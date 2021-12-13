import java.io.FileNotFoundException;

public class Programme {

    public static void main(String[] args) throws FileNotFoundException {

        Sonar sonar1 = new Sonar();
       // System.out.println(sonar1.runSonar()); //This will give the answer to Part 1
        System.out.println(sonar1.runSonarWindows()); //This will give the answer to Part 2


    }
}

