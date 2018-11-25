package app;

import java.util.Scanner;

public class Solver {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = reader.nextInt();

        HashTable<Integer> dict = new HashTable<Integer>(count);

        for (int i = 0; i < count; i++) {
            dict.Insert(reader.nextInt());
        }

        System.out.print(dict);
    }
}
