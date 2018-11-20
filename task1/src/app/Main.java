package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashTable<Integer> dict = new HashTable<Integer>(10);

        dict.Insert(10);
        dict.Insert(11);
        dict.Insert(14);

        System.out.print(dict);
    }
}
