package app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    static HashMap<String, KeyValue> data = new HashMap<String, KeyValue>();
    static ArrayList<KeyValue> list_data = new ArrayList<KeyValue>();

    public static void main(String[] args) {
        //String in = "aa aa bbb bbb bbb bbb bbb c c c c c c c c c";
        //String in = "aa c c c c c c c c c c c c c c c c c c c c c c c c c c c";
        String in = "aa aa aa aa aa bbb bbb bbb bbb c c c c c c c c c c c c c c c";

        String[] split = in.split(" ");

        for (int i = 0; i < split.length; i++) {
            try {
                data.get(split[i]).Increment();
            } catch (NullPointerException err) {
                KeyValue contain_data = new KeyValue(split[i]);
                data.put(split[i], contain_data);
                list_data.add(contain_data);
            }
        }

        list_data.sort(new Comparator<KeyValue>() {
            @Override
            public int compare(KeyValue o1, KeyValue o2) {
                if (o1.GetCount() > o2.GetCount()) {
                    return 1;
                }
                else if (o1.GetCount() < o2.GetCount()) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });

        for (KeyValue kv : list_data) {
            System.out.print(kv.toString()+"\n");
        }
    }
}
