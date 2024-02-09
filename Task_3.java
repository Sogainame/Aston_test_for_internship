public class EvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Even numbers in the array are:");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
