package app;

import java.util.ArrayList;

class HashTableContainer<T> {
    ArrayList<ListNode<T>> container;
    private int capacity;

    HashTableContainer(int max_count) {
        container = new ArrayList<ListNode<T>>(max_count);
    }

    public int Capacity() {
        return capacity;
    }
}
