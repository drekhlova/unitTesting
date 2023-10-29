package seminar6HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа первого списка через пробел:");
        ArrayList<Integer> numbers1 = getNumbersFromInput(scanner.nextLine());

        System.out.println("Введите числа второго списка через пробел:");
        ArrayList<Integer> numbers2 = getNumbersFromInput(scanner.nextLine());

        List list1 = new List(numbers1);
        List list2 = new List(numbers2);

        Average average = new Average(list1, list2);

        String result = average.compareAverages();
        System.out.println(result);
    }

    private static ArrayList<Integer> getNumbersFromInput(String input) {
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] inputArray = input.split(" ");
        for (String number : inputArray) {
            numbers.add(Integer.parseInt(number));
        }
        return numbers;
    }
    */

        // Создаем два списка чисел и объекты класса List для каждого списка
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)); // 1, 2, 3, 4, 5
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10)); // 6, 7, 8, 9, 10

        // Выводим списки чисел на экран
        System.out.println(numbers1);
        System.out.println(numbers2);

        List list1 = new List(numbers1);
        List list2 = new List(numbers2);

        // Создаем объект класса Average, который принимает два объекта класса List
        // и возвращает среднее значение числового массива
        Average average = new Average(list1, list2);

        String result = average.compareAverages();

        // Выводим результат на экран
        System.out.println(result);
    }
}

