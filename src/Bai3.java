import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập kích thước của mảng: ");
        int lengthNumber = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[lengthNumber];

        int count = 0;
        System.out.println("Vui lòng nhập các phần tử của mảng: \n");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("Tổng các phần tử là: " + count);
    }
}