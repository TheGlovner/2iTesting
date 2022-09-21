package solution;

import java.io.IOException;
import java.io.Reader;

public class FileRead {

    /**
     * Reads all values from input .txt file. Assumption is that data is supplied as
     * comma delimited list of characters.
     * @param reader supplied from the main class
     * @return A string of all characters from the supplied input file
     * @throws IOException
     */
    public static String readAllCharacters(Reader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        int nextChar;
        while ((nextChar = reader.read()) != -1) {
            content.append((char) nextChar);
        }
        return String.valueOf(content);
    }
}
