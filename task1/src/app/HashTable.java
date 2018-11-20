package app;

public class HashTable<T> {
    private HashTableContainer<T> container;
    private float loadFactor = 0.75f;

    public HashTable() {
        init(16);
    }
    public HashTable(int start_capasity) {
        init(start_capasity);
    }

    private void init(int start_capasity) {
        container = new HashTableContainer<T>(start_capasity);
    }

    public void Insert(T newValue) {
        int array_pos = container.Capacity() % newValue.hashCode();
        ListNode<T> e = container.container.get(array_pos);
        while (e != null) {
            e = e.next;
        }
        e = new ListNode<T>();
        e.Insert(newValue);
    }
    public String toString() {
        StringBuilder res = new StringBuilder();

        int k = 0;
        for (ListNode<T> node: container.container) {
            res.append(String.format("%s: ", k));
            k++;
            for (ListNode<T> e = node; node!=null; e = e.next) {
                res.append(e.toString()+" ");
            }
        }
        return res.toString();
    }
}