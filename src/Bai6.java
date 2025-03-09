public class Bai6 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 5, 8, 3, 8, 2, 6, 8, 2, 4, 2, 6};

        int[] markingArray = new int[1000];

        for (int i = 0; i < originalArray.length; i++) {
            int current = 0;
            for (int j = 0; j < originalArray.length; j++) {
                if (originalArray[i] == originalArray[j]) {
                    current++;
                }
            }
            for (int j = 0; j < markingArray.length; j++) {
                if (markingArray[j] == 0) {
                    markingArray[j] = current;
                    break;
                }
            }
        }

        int maxCurrent = 0;
        for (int i = 1; i < markingArray.length; i++) {
            if (markingArray[maxCurrent] <= markingArray[i]) {
                maxCurrent = i;
            }
        }
        System.out.println("Phần tử: " + originalArray[maxCurrent] + " , Số lần xuất hiện: " + markingArray[maxCurrent]);
    }
}