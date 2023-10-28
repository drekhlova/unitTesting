package seminar6HW;

public class Average {
    private List list1;
    private List list2;

    public Average(List list1, List list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public String compareAverages() {
        double average1 = list1.getAverage();
        double average2 = list2.getAverage();

        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average2 > average1) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
