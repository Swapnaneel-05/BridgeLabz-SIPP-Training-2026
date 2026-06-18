import java.util.*;

public class NestedTryCatch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        int divisor = sc.nextInt();

        try {
            try {
                int value = arr[index];
                System.out.println(value / divisor);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }
        sc.close();
    }
}