import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Category: ");
        String category = sc.nextLine();

        System.out.print("Amount: ");
        int amount = sc.nextInt();

        try (BufferedWriter bw =
                     new BufferedWriter(new FileWriter("expenses.txt", true))) {

            bw.write(category + " - " + amount);
            bw.newLine();

            System.out.println("Expense saved.");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
        sc.close();
    }
}
