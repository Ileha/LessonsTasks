package app;

interface ISetter<T> {
    void set(ListNode<T> value);
}

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
        int array_pos = newValue.hashCode() % container.Capacity();
        ListNode<T> e = container.container.get(array_pos);
        ListNode<T> entering_value = new ListNode<T>(newValue);
        if (e == null) {
            container.container.set(array_pos, entering_value);
        }
        else {
            for (ListNode<T> i = e; i != null; i = i.next) {
                if (i.equals(entering_value)) {
                    break;
                }
                if (i.next == null) {
                    i.next = entering_value;
                    break;
                }
            }
        }
    }

    public String toString() {
        StringBuilder res = new StringBuilder();

        int k = 0;
        for (ListNode<T> node: container.container) {
            res.append(String.format("%s: ", k));
            k++;
            for (ListNode<T> e = node; e!=null; e = e.next) {
                res.append(e.toString()+" ");
            }
            res.append("\n");
        }
        return res.toString();
    }
}