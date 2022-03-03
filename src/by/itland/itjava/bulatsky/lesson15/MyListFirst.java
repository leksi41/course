package by.itland.itjava.bulatsky.lesson15;

import java.util.Arrays;

public class MyListFirst<T> {

    private T[] array;
    private int capacity = 0;


    public MyListFirst() {
        this.array = (T[]) new Object[0];
    }

    public void add(T element) {

        T[] newArr = (T[]) new Object[capacity + 1];
        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[i];
        }
        newArr[capacity] = element;
        array = newArr;
        capacity++;

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
            if (i < (array.length - 1))
                sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }


}
