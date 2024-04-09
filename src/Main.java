import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int[] monthPay = {100500, 999, 400001, 111111, 50};
        int result = 0;
        for (int i : monthPay) {
            result += i;
        }
        System.out.println("Сумма трат за месяц составила " + result + " рублей.");

        //Задача 2
        System.out.println("\nЗадача 2");
        int maxPay = 0;
        for (int i : monthPay) {
            if (i > maxPay) {
                maxPay = i;
            }
        }
        Arrays.sort(monthPay);
        System.out.println("Минимальная сумма трат за неделю составила " + monthPay[0] + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPay + " рублей.");

        //Задача 3
        System.out.println("\nЗадача 3");
        double midPay = (double) result / monthPay.length;
        if (midPay % 1 == 0) {
            System.out.println("Средняя сумма трат за месяц составила " + (int) midPay + " рублей");
        } else System.out.println("Средняя сумма трат за месяц составила " + midPay + " рублей");

        //Задача 4*
        System.out.println("\nЗадача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length; i > 0; i--) {
            System.out.print(reverseFullName[i - 1]);
        }

        //Задача 4 со звёздочкой
        System.out.println("\n\nЗадача 4 со звёздочкой");
        char[] reverseArray = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseArray.length / 2; i++) {
            char temp = reverseArray[i];
            reverseArray[i] = reverseArray[reverseArray.length - 1 - i];
            reverseArray[reverseArray.length - 1 - i] = temp;
        }
        for (int i = 0; i < reverseArray.length; i++) {
            System.out.print(reverseArray[i]);
        }
    }
}