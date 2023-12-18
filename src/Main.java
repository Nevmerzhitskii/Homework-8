public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        int summ = 0;

        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];

        }  System.out.println("Сумма трат  за месяц составила " + summ + " рублей");


    }
    public static void task2() {
        System.out.println("Задача №2");
        int[] arr = generateRandomArray();

        int min = arr[0];
        int max = arr[0];
        for (int spend : arr) {
            if (spend < min) {
                min = spend;
            }

            if (spend > max) {
                max = spend;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальна сумма трат за день составила " + min + " рублей");

    }public static void task3() {
        System.out.println("Задача №3");
        int[] arr = generateRandomArray();

        int summ = 0;

        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];}

            double averageSum = summ / arr.length;
        System.out.println("Средняя сумма траты за месяц составляет " + averageSum + " рублей");

    }public static void task4() {

        System.out.println("Задача №4");
        int[] arr = generateRandomArray();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i -- ) {
            System.out.print(reverseFullName[i]);

        }





    }
}








































