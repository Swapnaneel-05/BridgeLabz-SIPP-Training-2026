import java.util.*;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30, 40};
            Scanner sc = new Scanner(System.in);

            int index = sc.nextInt();
            System.out.println("Value at index " + index + ": " + arr[index]);
            sc.close();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
        
    }
}