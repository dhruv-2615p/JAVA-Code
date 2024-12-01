import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        File fread = new File("IP.txt");
        File fwrite = new File("OP.txt");
        FileWriter writer = null;

        Scanner sc = null;

        try {
            sc = new Scanner(fread);
            fwrite.createNewFile();
            writer = new FileWriter(fwrite);

            while (sc.hasNextLine()) {
                String str = sc.next();
                int roll = sc.nextInt();
                Double sal = sc.nextDouble();

                writer.write(str + "\t" + roll + "\t" + sal + "\n");

                writer.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            try {
                if (writer != null || sc != null) {
                    writer.close();
                    sc.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}