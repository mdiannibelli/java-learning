public class BubbleSort {
    public static void main(String[] args) {
        double arrNums[] = { 7, 3, 4, 6, 1, 12.68, 5.99 };

        for (int i = arrNums.length - 2; i >= 0; i--) { // Starts at before the last number
            // System.out.println(arrNums[i]);
            for (int j = 0; j <= i; j++) { // To i
                if (arrNums[j] > arrNums[j + 1]) { // > => desc, < => asc
                    double temp = arrNums[j];
                    arrNums[j] = arrNums[j + 1];
                    arrNums[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arrNums.length; i++) {
            System.out.println(arrNums[i]);
        }
    }
}