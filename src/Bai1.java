public class Bai1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 5, 12, 44};
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] >= max) {
                max = numbers[i];
            }
        }
        System.out.println("Giá trị lơn nhất trong mảng là: " + max);
    }
}