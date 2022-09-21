package solution;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class MainClass {

    private static File file = new File("src/main/resources/TestData.txt");
    private static String testDataPath = file.getAbsolutePath();

    /**
     * Main process runner.
     * Allows the absolute path to be supplied as a command line argument otherwise
     * use the supplied path from the above fields.
     * @param args
     */
    public static void main(String[] args) {
        String path = testDataPath;
        if (args.length > 0) {
            path = args[0];
        }
        try {
            // Set up a file reader to the test data
            FileReader fileReader = new FileReader(path);

            // Read all data out to a string to start with
            String fileContent = FileRead.readAllCharacters(fileReader);

            // Split the string using the delimiter and pass it to be parsed and cleaned
            String[] splitInput = fileContent.split(",");
            TreeSet<Integer> sortedInputs = InputParse.cleanInputData(splitInput);

            // Print Result
            System.out.println(sortedInputs);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
