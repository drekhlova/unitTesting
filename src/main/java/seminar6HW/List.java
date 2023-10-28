package seminar6HW;

import java.util.ArrayList;

public class List {
    private ArrayList<Integer> numbers;

    public List(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    public double getAverage() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }
}

