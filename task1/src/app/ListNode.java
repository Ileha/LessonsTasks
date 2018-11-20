package app;

class ListNode<T> {
    T value;
    ListNode<T> next;

    void Insert(T newValue) {
        value = newValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (o instanceof ListNode<?>){
            if ( ((ListNode<?>)o).value.equals(value) ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
