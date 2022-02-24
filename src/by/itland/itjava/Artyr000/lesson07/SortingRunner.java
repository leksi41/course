package by.itland.itjava.Artyr000.lesson07;

import by.itland.itjava.davydovskikh.less7.SortingMethod;
import by.itland.itjava.davydovskikh.less7.Util;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class SortingRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = Util.generateArray(size);
        System.out.println("исходный массив на " + size + " элементов");
//        Util.printArray(array);
        System.out.println();
        System.out.printf("%-10s| %-20s| %-15s| %-15s| %-15s| %-10s|%n", "Размер", "Сортировка", "Итерации", "Перестановки", "Время (мсек)", "Результат");
        System.out.println("---------------------------------------------------------------------------------------------");

        long start = new Date().getTime();
        int[] arrayCopy = Arrays.copyOfRange(array, 0, array.length);
        SortingMethod.quickSort(arrayCopy, 0, size - 1);
        getInformationSort(arrayCopy, start, SortingMethod.counterQuick, SortingMethod.changeQuick, "Quick sort");

        start = new Date().getTime();
        arrayCopy = Arrays.copyOfRange(array, 0, array.length);
        SortingMethod.mergeSort(arrayCopy, size);
        getInformationSort(arrayCopy, start, SortingMethod.counterMerge, SortingMethod.changeMerge, "Merge sort");

        start = new Date().getTime();
        arrayCopy = Arrays.copyOfRange(array, 0, array.length);
        SortingMethod.selectionSort(arrayCopy);
        getInformationSort(arrayCopy, start, SortingMethod.counterSelect, SortingMethod.changeSelect, "Selection sort");

        arrayCopy = Arrays.copyOfRange(array, 0, array.length);
        SortingMethod.shakerSort(arrayCopy);
        getInformationSort(arrayCopy, start, SortingMethod.counterShaker, SortingMethod.changeShaker, "Shaker sort");

        start = new Date().getTime();
        arrayCopy = Arrays.copyOfRange(array, 0, array.length);
        SortingMethod.insertionSort(arrayCopy);
        getInformationSort(arrayCopy, start, SortingMethod.counterInsert, SortingMethod.changeInsert, "Insertion sort");

        start = new Date().getTime();
        arrayCopy = Arrays.copyOfRange(array, 0, array.length);
        SortingMethod.bubbleSort(arrayCopy);
        getInformationSort(arrayCopy, start, SortingMethod.counterBobble, SortingMethod.changeBobble, "Bobble sort");
    }

    private static void getInformationSort(int[] array, long start, long counter, long change, String nameSort) {
        long currentTime = new Date().getTime();
        long time = currentTime - start;
        System.out.printf("%10d| %-20s| %15d| %15d| %15d| %10b|%n", array.length, nameSort, counter, change, time, Util.checkSort(array));
    }
}

/*опорный элемент в Quick sort - центральный*/
//        int middle = (left + right) / 2;
//        int key = array[middle];
//        Util.change(array,middle,left);

/*опорный элемент в Quick sort - случайный*/
//        int index = new Random().nextInt(right - left) + left;
//        int key = array[index];
//        Utilchange(array, index, left);