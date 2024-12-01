import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            fin = new FileInputStream("Test.txt");
            fout = new FileOutputStream("Output.txt");
        } catch (Exception e) {
            System.out.println("Error in opening file.");
        }

        try {
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                    System.out.print((char) i);
                    fout.flush();
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error reading file.");
        } catch(NullPointerException e){
            System.out.println("Error : " + e);
        }

        finally {
            try {
                if (fin != null)
                    fin.close();
            } catch (IOException e) {
                System.out.println("File can not be able to close.");
            }
        }
    }
}
