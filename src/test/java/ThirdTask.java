public class ThirdTask {
    public static void main(String[] args) {
        double[] numbers = {8, 9, 3, 7, 4, 12};

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 3) == 0) {
                System.out.println(numbers[i]);
            }
        }
    }
}
