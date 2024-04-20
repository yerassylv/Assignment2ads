
public interface MyList<T> {
    void addElement(T data);
    T getElement(int index);
    int getSize();
    void remove(int index);
    void clear();
}

