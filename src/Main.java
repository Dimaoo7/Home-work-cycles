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

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int sum = 0;
        int month = 0;
        while (sum <= 2_459_000) {
            month = month + 1;
            sum = sum + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + "рублей");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int numba = 1;
        while (numba <= 10) {
            System.out.print(numba + " ");
            numba++;
        }
        System.out.println(" ");
        for (int i = 10; i >= 1; i--) {

            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int sumOfPeople = 12_000_000;
        int born = 17;
        int death = 8;
        int diff = born - death;
        for (int i = 1; i <= 10; i++) {
            sumOfPeople += sumOfPeople * diff / 1000;
        }
        System.out.println(sumOfPeople);
    }


    public static void task4() {
        System.out.println("Задача 4");
        double sum = 15_000;
        int month = 1;
        while (sum <= 12_000_000) {
            sum = sum + sum * 0.07;
            System.out.println(" Месяц " + month + " " + " Сумма " + sum);
            month++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double sum = 15_000;
        int month = 1;
        while (sum <= 12_000_000) {
            sum = sum + sum * 0.07;
            month++;
            if (month % 6 == 0)
                System.out.println(" Месяц " + month + " " + " Сумма " + sum);
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        double sum = 15_000;
        int month = 1;
        while (month < 9 * 12) {
            sum = sum + sum * 0.07;
            month++;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + " Сумма " + sum);
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int day = 0;
        for (int friday = 3; friday <= 31; friday = friday + 7) {
            day++;
            System.out.println("Сегодня " + day + " пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }

    }
    public static void task8() {
        System.out.println("Задача 8");
        int last = 2023 - 200;
        int next = 2023 + 100;

        for (; last < next; last = last + 79) {
            System.out.println("Приветик, метеорит будет: " + last);
        }

    }

}
