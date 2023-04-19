public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 12;
        short b = 14;
        int c = 16;
        long d = 18L;
        float e = 12.65f;
        double f = 1.12443256;
        System.out.println("значение переменной (a) с типом byte равно " + a);
        System.out.println("значение переменной (b) с типом short равно " + b);
        System.out.println("значение переменной (c) с типом byte равно " + c);
        System.out.println("значение переменной (d) с типом byte равно " + d);
        System.out.println("значение переменной (e) с типом byte равно " + e);
        System.out.println("значение переменной (f) с типом byte равно " + f);

    }
    public static void task2() {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        int d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
    }public static void task3() {
        System.out.println("Задача 3");
        int LP = 23;
        int AS = 27;
        int EA = 30;
        int paper = 480;
        int totalStudents = LP + AS + EA;
        int forOne = paper / totalStudents;
        System.out.println("На каждого ученика расчитано " + forOne + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4");
        int bottleInTwoMin = 16;
        int day = bottleInTwoMin * 30 * 24;
        int threeDays = day * 3;
        int month = threeDays * 10;
        System.out.println("За 1 день машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5");
        int whiteForOneClassroom = 2;
        int brownForOneClassroom = 4;
        int forOneClassroom = brownForOneClassroom + whiteForOneClassroom;
        int allClassroom = 120 / forOneClassroom;
        int allBrownPaint = allClassroom * brownForOneClassroom;
        int allWhitePaint = allClassroom * whiteForOneClassroom;
        System.out.println("В школе, где " + allClassroom + " классов, нужно " + allWhitePaint +
        " банок белой краски и " + allBrownPaint + " коричневой краски" );

    }
    public static void task6() {
        System.out.println("Задача 6");
        int banana = 80 * 5;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int eggs = 70 * 4;
        float all = banana + milk + iceCream + eggs;
        float kg = all / 1000;
        System.out.println(kg + " кг");
        System.out.println(all + " г");
    }












}

