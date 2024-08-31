public class Solution {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        // напишите тут ваш код
        int[] array1;
        int[] array2;

        if (array.length % 2 == 0) {
            array1 = Arrays.copyOfRange(array, 0, array.length / 2);
            array2 = Arrays.copyOfRange(array, array.length / 2, array.length);
        } else {
            array1 = Arrays.copyOfRange(array, 0, array.length / 2 + 1);
            array2 = Arrays.copyOfRange(array, array.length / 2 + 1, array.length);
        }

        result[0] = array1;
        result[1] = array2;

        System.out.println(Arrays.deepToString(result));
    }
}
