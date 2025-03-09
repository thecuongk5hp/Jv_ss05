import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập kích thước của mảng: ");
        int lengthNumber = Integer.parseInt(scanner.nextLine());
        if (lengthNumber == 0) {
            System.out.println("Mảng không có phần tử");
            System.exit(0);
        }

        int[] numbers = new int[lengthNumber];

        System.out.println("Vui lòng nhập các phần tử của mảng: \n");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] newNumbers = new int[lengthNumber];
        int currentIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                for (int j = currentIndex; j < newNumbers.length; j++) {
                    newNumbers[j] = numbers[i];
                    currentIndex++;
                    break;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                for (int j = currentIndex; j < newNumbers.length; j++) {
                    newNumbers[j] = numbers[i];
                    currentIndex++;
                    break;
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < newNumbers.length; i++) {
            System.out.println(newNumbers[i]);
        }
    }
}