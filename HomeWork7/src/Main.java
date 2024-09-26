public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int accumulation = 15000;
        float total = 0;
        int mounth = 1;
        float procent = 0.01f;
        while (total <= 2_459_000) {
            total = total * procent + total;
            total = total + accumulation;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + total);
            mounth++;
        }
        System.out.println();

        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        int population = 12_000_000;
        int year = 1;

        while (year <= 10) {
            System.out.println("Год " + year + " численность населения равна " + population);
            int fertility = 17 * (population / 1000);
            int mortality = 8 * (population / 1000);
            population = population + fertility - mortality;
            year++;
        }
        System.out.println();

        System.out.println("Задача 4");
        accumulation = 15000;
        total = 0;
        mounth = 1;
        procent = 0.07f;
        while (total <= 12_000_000) {
            total = total * procent + total;
            total = total + accumulation;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + total);
            mounth++;
        }
        System.out.println();

        System.out.println("Задача 5");
        accumulation = 15000;
        total = 0;
        mounth = 1;
        procent = 0.07f;
        while (total <= 12_000_000) {
            total = total * procent + total;
            total = total + accumulation;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + ", сумма накоплений равна " + total);
            }
            mounth++;
        }
        System.out.println();

        System.out.println("Задача 6");
        accumulation = 15000;
        total = 0;
        mounth = 1;
        procent = 0.07f;
        while (mounth <= 108) {
            total = total * procent + total;
            total = total + accumulation;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + ", сумма накоплений равна " + total);
            }
            mounth++;
        }
        System.out.println();

        System.out.println("Задача 7");
        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
        System.out.println();

        System.out.println("Задача 8");
        year = 0;
        while (year <= 2123) {
            year += 79;
            if (year > 1823 && year <= 2123) {
                System.out.println(year);
            }
        }

    }
}