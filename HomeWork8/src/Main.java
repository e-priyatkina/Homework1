import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arrOne = new int[3];
        arrOne[0] = 1;
        arrOne[1] = 2;
        arrOne[2] = 3;

        float[] arrTwo = {1.57f, 7.654f, 9.986f};

        boolean[] arrThree = {true, false, true, true};
        System.out.println();

        System.out.println("Задача 2");
        for (int i = 0; i < arrOne.length; i++) {
            System.out.print(arrOne[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arrTwo.length; i++) {
            System.out.print(arrTwo[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arrThree.length; i++) {
            System.out.print(arrThree[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 3");
        for (int i = arrOne.length - 1; i >= 0; i--) {
            System.out.print(arrOne[i] + " ");
        }
        System.out.println();

        for (int i = arrTwo.length - 1; i >= 0; i--) {
            System.out.print(arrTwo[i] + " ");
        }
        System.out.println();

        for (int i = arrThree.length - 1; i >= 0; i--) {
            System.out.print(arrThree[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] % 2 != 0) {
                arrOne[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrOne));
    }
}