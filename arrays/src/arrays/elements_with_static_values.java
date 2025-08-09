package arrays;

public class elements_with_static_values {

    static int[] numbers = {10, 20, 30, 40, 50};
    public static void main(String[] args) {
        System.out.println("Elements in the static array:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
