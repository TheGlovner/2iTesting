package solution;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class MainClass {

    private static File file = new File("src/main/resources/TestData.txt");
    private static String absolutePath = file.getAbsolutePath();

    public static void main(String[] args) {
        try {
            // Set up a file reader to the test data
            FileReader fileReader = new FileReader(absolutePath);

            // Read all data out to a string to start with
            String fileContent = FileRead.readAllCharacters(fileReader);

            // Split the string using the delimiter
            String[] splitInput = fileContent.split(",");
            TreeSet<Integer> sortedInputs = InputParse.cleanInputData(splitInput);

            // Print Result
            System.out.println(sortedInputs);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
