import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = 0; i < 17; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 8");
        int accumulation = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
        System.out.println();

        System.out.println("Задача 9");
        total = 0;
        accumulation = 29000;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
        System.out.println();

        System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}