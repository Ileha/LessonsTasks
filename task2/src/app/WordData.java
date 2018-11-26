package app;

public class WordData {
    public int max_word_lenght = 0;
    public int count_max = 1;
    private int point_count = 10;

    public WordData(int point_count) {
        this.point_count = point_count;
    }

    public int GetPointCount() {
        return point_count;
    }

    public void Reset() {
        max_word_lenght = 0;
        count_max = 1;
    }
}
