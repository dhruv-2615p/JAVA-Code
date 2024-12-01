import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Breader {
    public static void main(String[] args) {
        File f = new File("Test.txt");
        FileReader fr = null;
        BufferedReader br = null;
        String str;

        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                if (fr != null || br != null) {
                    fr.close();
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
