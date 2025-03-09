import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập kích thước của mảng: ");
        int lengthNumber = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[lengthNumber];

        System.out.println("Vui lòng nhập các phần tử của mảng: \n");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        if (max % 2 == 0) {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    max = numbers[i];
                }
            }
        } else {
            for (int i = 1; i < numbers.length; i++) {
                if (max <= numbers[i] && max % 2 != 0) {
                    max = numbers[i];
                }
            }
        }

        System.out.println("Phần tử lẻ nguyên dương lớn nhất là: " + max);

        int min = numbers[0];
        if (max % 2 == 0) {
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    max = numbers[i];
                }
            }
        } else {
            for (int i = 1; i < numbers.length; i++) {
                if (min >= numbers[i] && min % 2 == 0 && numbers[i] > 0) {
                    min = numbers[i];
                }
            }
        }
        System.out.println("Phần tử lẻ nguyên dương nhỏ nhất là: " + min);
    }
}