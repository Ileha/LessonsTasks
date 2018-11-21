package app;

import java.util.Comparator;

public class KeyValue {
    private static int max_word_lenght = 0;
    private static int count_max = 1;
    private static int point_count = 10;

    private String key;
    private int count;

    public KeyValue(String name) {
        key = name;
        count = 1;
        if (max_word_lenght < key.length()) {
            max_word_lenght = key.length();
        }
    }

    public int GetCount() {
        return count;
    }

    public String GetName() {
        return key;
    }

    public void Increment() {
        count++;
        if (count_max < count) {
            count_max = count;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        int _count = max_word_lenght-key.length();
        for (int i=0; i < _count; i++) {
            sb.append("_");
        }
        sb.append(key+"\t");

        float fract = ((float)count)/count_max;
        int _current_point_count = Math.round(fract*point_count);
        for (int i = 0; i <_current_point_count; i++) {
            sb.append(".");
        }

        return sb.toString();
    }

    public static void Reset() {
        max_word_lenght = 0;
        count_max = 1;
    }
}
