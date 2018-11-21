package app;

import java.util.ArrayList;

class HashTableContainer<T> {
    ArrayList<ListNode<T>> container;
    private int capacity;

    HashTableContainer(int max_count) {
        container = new ArrayList<ListNode<T>>(max_count);
        for (int i = 0; i < max_count; i++) {
            container.add(null);
        }
        capacity = max_count;
    }

    public int Capacity() {
        return capacity;
    }
}
