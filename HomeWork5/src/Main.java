public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int clientOS = 1;
        if (clientOS == 0) {System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
           System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Такой операционной системы нет");
        }
        System.out.println();

        System.out.println("Задача 2");
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегеченную версию приложения для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear >= 2015){
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегеченную версию приложения для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        if (clientOS != 0 && clientOS != 1) {
            System.out.println("Такой операционной системы нет");
        }
        System.out.println();

        System.out.println("Задача 3");
        int year = 2100;
        if (year % 4 == 0 && year > 1584 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();

        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();

        System.out.println("Задача 5");
        int monthNumber = 2;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нет");
                break;
        }
    }
}