package by.itland.itjava.bulatsky.lesson15;

public class MyListSecond<T> {

    private T[] array;
    private int capacity = 10;
    private int current = 0;

    public MyListSecond() {
        this.array = (T[]) new Object[capacity];
    }

    public void add(T element) {
        if (current == capacity) {
            capacity = (int) (capacity * 1.5);

            T[] newArr = (T[]) new Object[capacity];
            for (int i = 0; i < array.length; i++) {
                newArr[i] = array[i];
            }
            array = newArr;
        }
        array[current] = element;
        current++;

    }

    public T get(int index) {

        return array[index];
    }

    public void remove(int index) {
        T[] newArr = (T[]) new Object[capacity - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = array[i];
        }
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = newArr[i + 1];
        }
        array = newArr;
        capacity--;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (array[i] != null) {
                 sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }


}
