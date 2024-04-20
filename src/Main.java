public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();


        myList.addElement(1);
        myList.addElement(2);
        myList.addElement(3);
        myList.addElement(4);
        myList.addElement(5);
        myList.addElement(6);
        myList.addElement(7);
        myList.addElement(8);


        System.out.println("Size: " + myList.getSize());
        System.out.println("Element at index 2: " + myList.getElement(3));
        System.out.println("Element at index 4 after removal:" + myList.getElement(3));
        myList.remove(3);
        System.out.println("Size after removal: " + myList.getSize());
        myList.clear();
        System.out.println("Size after clearing: " + myList.getSize());

    }
}
