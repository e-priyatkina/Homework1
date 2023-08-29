import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        short age = 16;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то он несовершеннолетний");
        }
        System.out.println();

        System.out.println("Задача 2");
        short degree = -5;
        if (degree <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println();

        System.out.println("Задача 3");
        short speed = 80;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость" + speed + ", то можно ездить спокойно");
        }
        System.out.println();

        System.out.println("Задача 4");
        short years = 4;
        if (years >= 2 && years <=6) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в детский сад");
        }
        if (years >= 7 && years <=18) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в школу");
        }
        if (years > 18 && years <=24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить в университет");
        }
        if (years > 24) {
            System.out.println("Если возраст человека равен " + years + ", то ему нужно ходить на работу");
        }
        System.out.println();

        System.out.println("Задача 5");
        age = 13;
        if (age <= 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на аттракционе");
        }
        if (age > 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься на аттракционе в сопровождении взрослого");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
        }
        System.out.println();

        System.out.println("Задача 6");
        short place = 61;
        short total = 102;
        short seat = 60;

        if (place <= seat) {
            System.out.println("Есть сидячие места " + (seat - place + 1) + " штук");
        } else {
            if (place > seat && place <= total) {
                System.out.println("Есть стоячие места " + (total - place + 1) + " штук");
            } else {
                System.out.println("Нет свободных мест");
            }
        }
        System.out.println();

        System.out.println("Задача 7");
        int one = 5;
        int two = 4;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(one);
        } else {
            if (two > one && two > three) {
                System.out.println(two);
            } else {
                System.out.println(three);
            }
        }
    }
}