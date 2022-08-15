public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int [] payments = generateRandomArray();
        int totalPayment = 0;
        for (int j : payments) {
            totalPayment += j;
        }
        System.out.println("Сумма трат за месяц составила " + totalPayment + " рублей");

        //Task 2
        System.out.println("Task 2");
        int minPayment = payments[0];
        int maxPayment = payments[0];
        for (int payment : payments) {
            if (payment <= minPayment) {
                minPayment = payment;
            }
            if (payment >= maxPayment) {
                maxPayment = payment;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей. " +
                "Максимальная сумма трат за день составила " + maxPayment + " рублей");

        //Task 3
        System.out.println("Task 3");
        double averagePayment = (double) totalPayment / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + averagePayment + " рублей" );

        //Task 4
        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}