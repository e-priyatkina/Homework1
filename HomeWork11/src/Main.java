import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void determineTheYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }
    public static void task1() {
        int year = 2021;
        determineTheYear(year);
    }

    public static void version(int oS, int clientDeviceYear) {
        if (oS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (oS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (oS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (oS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой операционной системы не существует");
        }
    }
    public static void task2() {
        int oS = 1;
        int currentYear = LocalDate.now().getYear();
        version(oS, currentYear);
    }

    public static int delivery(int deliveryDistance) {
        int days = -1;
        if (deliveryDistance <= 20) {
            days = 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            days = 2;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100)
            days = 3;
        if (deliveryDistance > 100) {
            days = 0;
        }
        return days;
    }
    public static void task3() {
        int deliveryDistance = 95;
        if (delivery(deliveryDistance) == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Доставка занимает " + delivery(deliveryDistance) + " дня");
        }
    }
}