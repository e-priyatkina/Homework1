public class Main {
    public static void main(String[] args) {

        byte variable1 = 56;
        System.out.println("Значение переменной variable1 с типом byte равно " + variable1);

        short variable2 = 16745;
        System.out.println("Значение переменной variable2 с типом short равно " + variable2);

        int variable3 = 1524894;
        System.out.println("Значение переменной variable3 с типом int равно " + variable3);

        long variable4 = 467389476298452L;
        System.out.println("Значение переменной variable4 с типом long равно " + variable4);

        float variable5 = 4673.8947f;
        System.out.println("Значение переменной variable5 с типом float равно " + variable5);

        double variable6 = 4673.89479579557;
        System.out.println("Значение переменной variable6 с типом double равно " + variable6);
        System.out.println();

        float a = 27.12f;
        long b = 987678965549L;
        short c = 569;
        short d = -159;
        short e = 27897;
        byte f = 67;

        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short paper = 480;

        int totalStudents = LP + AS + EA;
        int oneStudent = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + oneStudent + " листов бумаги");
        System.out.println();


        byte oneMinute = 16 / 2;
        int twentyMinute = oneMinute * 20;
        System.out.println("За 20 минут машина произвела " + twentyMinute + " штук бутылок");
        int oneDay = oneMinute * 60 * 24;
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        int threeDays = oneDay * 3;
        System.out.println("За 3 суток машина произвела " + threeDays + " штук бутылок");
        int oneMounth = oneDay * 30;
        System.out.println("За месяц машина произвела " + oneMounth + " штук бутылок");
        System.out.println();


        byte white = 2;
        byte brown = 4;
        int totalClasses = 120 / (white + brown);
        int totalWhite = totalClasses * white;
        int totalBrown = totalClasses * brown;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
        System.out.println();


        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 *100;
        int egg = 4 * 70;

        int totalWeight = bananas + milk + iceCream + egg;
        System.out.println("Вес завтрака в граммах " + totalWeight + " гр");
        float totalWeightKg = totalWeight / 1000f;
        System.out.println("Вес завтрака в килограммах " + totalWeightKg + " кг");
        System.out.println();

        float days250gr = 7000f / 250;
        float days500gr = 7000f / 500;
        float daysSr = (days250gr + days500gr) / 2;
        System.out.println("Если спортсмен каждый день будет терять по 250 гр, то потребуется " + days250gr + " дней");
        System.out.println("Если спортсмен каждый день будет терять по 500 гр, то потребуется " + days500gr + " дней");
        System.out.println("В среднем на похудение уйдет " + daysSr + " день");
        System.out.println();


        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;

        float newMasha = Masha * 1.1f;
        float newDenis = Denis * 1.1f;
        float newKristina = Kristina * 1.1f;

        float differenceMasha = (newMasha - Masha) * 12;
        float differenceDenis = (newDenis - Denis) * 12;
        float differenceKristina = (newKristina - Kristina) * 12;

        System.out.println("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");
    }
}