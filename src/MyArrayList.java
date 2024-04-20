public class MyArrayList<T> implements MyList<T> {
    private Object[] arr;
    private int size;

    public MyArrayList() {
        arr = new Object[10];
        size = 0;
    }

    @Override
    public void addElement(T data) {
        if (size == arr.length) {
            increaseCapacity();
        }
        arr[size++] = data;
    }

    private void increaseCapacity() {
        Object[] newArr = new Object[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;
    }

    @Override
    public T getElement(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) arr[index];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
    }
    public void removeFirst(){

    }
    public void removeLast(){

    }
    public void sort(){

    }
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }
    public void addFirst(T item){


    }
    public void addLast(T item){

    }

}

