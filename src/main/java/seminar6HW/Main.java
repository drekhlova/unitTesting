package seminar6HW;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
}
