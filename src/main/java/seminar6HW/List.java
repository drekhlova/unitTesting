package seminar6HW;

import java.util.ArrayList;

/* Класс List содержит список чисел и метод для вычисления среднего значения */
public class List {
    private final ArrayList<Integer> numbers;

    public List(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public double getAverage() {
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }
}

