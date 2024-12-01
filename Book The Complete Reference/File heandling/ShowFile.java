import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // open file
        try {
            fin = new FileInputStream("Test.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Can not open file.");
        }

        // file is open and can read.
        try {
            do {
                i = fin.read(); // if no file exist then throw Exception null pointer exception
                if (i != -1)
                    System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error Reading File.");
        } catch (NullPointerException e) {
            System.out.println("Can not find file so, access null pointer.");
        }

        // close file
        finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}