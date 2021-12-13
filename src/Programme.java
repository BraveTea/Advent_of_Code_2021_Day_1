import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Programme {

    public static void main(String[] args) throws FileNotFoundException {

        Sonar sonar1 = new Sonar();
        System.out.println(sonar1.runSonar());

    }
}

