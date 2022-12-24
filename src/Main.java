public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int integerVar = 10000;
        byte byteVar = 100;
        short shortVar = 1000;
        long longVar = 1000L;
        float floatVar = 3.5f;
        double doubleVar = 0.001;

        System.out.println("Значение переменной integerVar с типом int равно " + integerVar);
        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);
        System.out.println("Значение переменной floatVar с типом float равно " + floatVar);
        System.out.println("Значение переменной doubleVar с типом double равно " + doubleVar);
    }

    public static void task2 () {
        System.out.println("Задача 2");

        float var1 = 27.12f;
        long var2 = 987678965549L;
        double var3 = 2.786;
        short var4 = 569;
        short var5 = -159;
        int var6 = 27897;
        byte var7 = 67;
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int students1 = 23;
        int students2 = 27;
        int students3 = 30;

        int papers = 480;
        float paperPerStudent = papers / (students1 + students2 + students3);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int bottles = 16;
        int timeOfProduction = 2;
        double bottlesPerMin = bottles / timeOfProduction;

        timeOfProduction = 20;
        double bottlesProduced = timeOfProduction * bottlesPerMin;
        System.out.println("За 20 минут машина произвела " + bottlesProduced + " штук бутылок");

        timeOfProduction = 3600 * 24;
        bottlesProduced = timeOfProduction * bottlesPerMin;
        System.out.println("За сутки машина произвела " + bottlesProduced + " штук бутылок");

        timeOfProduction = 3600 * 24 * 3;
        bottlesProduced = timeOfProduction * bottlesPerMin;
        System.out.println("За 3 дня машина произвела " + bottlesProduced + " штук бутылок");

        timeOfProduction = 3600 * 24 * 30;
        bottlesProduced = timeOfProduction * bottlesPerMin;
        System.out.println("За месяц машина произвела " + bottlesProduced + " штук бутылок");
    }

    public static void task5 () {
        System.out.println("Задача 5");

        int totalBuckets = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;

        int classes = totalBuckets / (whitePerClass + brownPerClass);
        int whiteTotal = classes * whitePerClass;
        int brownTotal = classes * brownPerClass;
        System.out.println("В школе, где "
                + classes
                + " классов, нужно "
                + whiteTotal
                + " банок белой краски и "
                + brownTotal
                + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");

        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;

        int breakfastWeight = bananas + milk + iceCream + eggs;
        float breakfastWeightKG = breakfastWeight / 1000f;
        System.out.println("Вес завтрака: "
                + breakfastWeight + "г или "
                + breakfastWeightKG + "кг."
        );
    }

    public static void task7 () {
        System.out.println("Задача 7");

        int weightToLose = 7 * 1000;
        int gramsLostPerDayMin = 250;
        int gramsLostPerDayMax = 500;

        int dietDaysMin = weightToLose / gramsLostPerDayMax;
        int dietDaysMax = weightToLose / gramsLostPerDayMin;
        double dietDaysAvg = 0.5 * (dietDaysMin + dietDaysMax);

        System.out.println("Дней на похудение: "
                + dietDaysMin + " при похудании на 500г в день; "
                + dietDaysMax + " при похудании на 250г в день; "
                + dietDaysAvg + " в среднем."
        );
    }

    public static void task8 () {
        System.out.println("Задача 8");

        int emp1 = 67760;
        int emp2 = 83690;
        int emp3 = 76230;

        double empNewSalary = emp1 * 1.1;
        double empYearGain = emp1 * 1.2;
        System.out.println("Маша теперь получает "
                + empNewSalary + " руб. Годовой доход вырос на "
                + empYearGain + " руб.");

        empNewSalary = emp2 * 1.1;
        empYearGain = emp2 * 1.2;
        System.out.println("Денис теперь получает "
                + empNewSalary + " руб. Годовой доход вырос на "
                + empYearGain + " руб.");

        empNewSalary = emp3 * 1.1;
        empYearGain = emp3 * 1.2;
        System.out.println("Кристина теперь получает "
                + empNewSalary + " руб. Годовой доход вырос на "
                + empYearGain + " руб.");
    }
}