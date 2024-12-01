import java.io.FileReader;
import java.io.IOException;

public class FileReaderChunk {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("Test.txt");
        } catch (IOException e) {
            System.out.println("Error in opening file.");
        }

        try {
            char[] buffer = new char[100];
            int numCharsRead;

            while ((numCharsRead = fr.read(buffer)) != -1)
                System.out.print(new String(buffer, 0, numCharsRead));

        } catch (IOException e) {
            System.out.println("I/O exception: " + e);
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }

        finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
