import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Домашка
        // Задача 1
        /*
        Объявите три массива:
        - Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        - Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу
        заполните значениями.
        - Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите
        способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        */
        System.out.println("Задача 1");
        int[] arrayInt = new int[3];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + 1;
        }

        double[] arrayDouble = {1.57, 7.654, 9.986};

        String[] strings = {"Hello", "world", "!"};
        System.out.println("Объявление массивов.");

        // Задача 2
        /*
        Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
        В конце строки запятую ставить не надо.
        */
        System.out.println("Задача 2");
        for (int i = 0; i < arrayInt.length; i++) {
            if (i < arrayInt.length - 1) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.printf(arrayInt[i] + "%n");
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (i < arrayDouble.length - 1) {
                System.out.print(arrayDouble[i] + ", ");
            } else {
                System.out.printf(arrayDouble[i] + "%n");
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (i < strings.length - 1) {
                System.out.print(strings[i] + ", ");
            } else {
                System.out.printf(strings[i] + "%n");
            }
        }

        // Задача 3
        /*
        Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
        В конце строки запятую ставить не надо.
        */
        System.out.println("Задача 3");
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.printf(arrayInt[i] + "%n");
            }
        }
        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(arrayDouble[i] + ", ");
            } else {
                System.out.printf(arrayDouble[i] + "%n");
            }
        }
        for (int i = strings.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(strings[i] + ", ");
            } else {
                System.out.printf(strings[i] + "%n");
            }
        }

        // Задача 4
        /*
        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
        Распечатайте результат преобразования в консоль.
        */
        System.out.println("Задача 4");
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0){
                arrayInt[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}