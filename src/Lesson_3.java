public class Lesson_3 {
    public static void main(String[] args) {
        int[] array = new int[]{4, 55, 67, 90, 125, 3, 1000, 555, 333, 666};
        int max = array[0];
        int min = array[0];

        for(int i = 0; i < array.length; ++i) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("The maximum value in the array: " + max);
        System.out.println("The minimum value in the array: " + min);
    }
}
