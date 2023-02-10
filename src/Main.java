public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int sum = 0;
        int month = 0;
        while (sum < 2_459_000) {
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
}
