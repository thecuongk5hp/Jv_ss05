import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập kích thước của mảng: ");
        int lengthNumber = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[lengthNumber];

        System.out.println("Vui lòng nhập các phần tử của mảng: \n");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Mảng ban đầu");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("Mảng sau khi đảo ngược: \n");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}