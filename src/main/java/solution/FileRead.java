package solution;

import java.io.IOException;
import java.io.Reader;

public class FileRead {

    public static String readAllCharacters(Reader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        int nextChar;
        while ((nextChar = reader.read()) != -1) {
            content.append((char) nextChar);
        }
        return String.valueOf(content);
    }
}
