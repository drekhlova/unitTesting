package seminar6HW;

/* Класс Average содержит два объекта класса List, метод для сравнения средних значений
и метод для вывода сообщения о результатах сравнения */

public class Average {
    private final List list1;
    private final List list2;

    public Average(List list1, List list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public String compareAverages() {
        double average1 = list1.getAverage();
        double average2 = list2.getAverage();

        System.out.println("Среднее значение первого списка: " + average1);
        System.out.println("Среднее значение второго списка: " + average2);

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
