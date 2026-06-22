import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BillReader {
    public static void main(String[] args) {
        int lines = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("bill.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lines++;
            }

            System.out.println("Total Lines = " + lines);

        } catch (FileNotFoundException e) {
            System.out.println("bill.txt not found");
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
