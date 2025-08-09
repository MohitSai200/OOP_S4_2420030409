package arrays;
import java.util.Scanner;
public class remove_dublicate_peint_value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int n;

        System.out.print("How many numbers? ");
        n = sc.nextInt();

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Unique elements:");
        for (int i = 0; i < n; i++) {
            boolean duplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}
