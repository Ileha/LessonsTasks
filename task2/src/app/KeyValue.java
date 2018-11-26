package app;

public class KeyValue {
    /*
    private static int max_word_lenght = 0;
    private static int count_max = 1;
    private static int point_count = 10;
    */
    private String key;
    private int count;
    private WordData current_word_data;

    public KeyValue(String name, WordData data) {
        key = name;
        count = 1;
        current_word_data = data;
        if (current_word_data.max_word_lenght < key.length()) {
            current_word_data.max_word_lenght = key.length();
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
        if (current_word_data.count_max < count) {
            current_word_data.count_max = count;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        int _count = current_word_data.max_word_lenght-key.length();
        for (int i=0; i < _count; i++) {
            sb.append("_");
        }
        sb.append(key+"\t");

        float fract = ((float)count)/current_word_data.count_max;
        int _current_point_count = Math.round(fract*current_word_data.GetPointCount());
        for (int i = 0; i <_current_point_count; i++) {
            sb.append(".");
        }

        return sb.toString();
    }
}
