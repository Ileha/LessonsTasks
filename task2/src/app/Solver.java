package app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class Solver {
    static HashMap<String, KeyValue> data = new HashMap<String, KeyValue>();
    static ArrayList<KeyValue> list_data = new ArrayList<KeyValue>();

    public static void main(String[] args) throws IOException {
        //String in = "aa aa bbb ma bbb bbb bbb bbb c c c c ka c c c c c ka ka ka ka ka ma";
        //String in = "aa c c c c c c c c c c c c c c c c c c c c c c c c c c c";
        //String in = "aa aa aa aa aa bbb bbb bbb bbb c c c c c c c c c c c c c c c";

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner reader = new Scanner(in.readLine());

        while (reader.hasNext()) {
            String split = reader.next();
            try {
                data.get(split).Increment();
            } catch (NullPointerException err) {
                KeyValue contain_data = new KeyValue(split);
                data.put(split, contain_data);
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
