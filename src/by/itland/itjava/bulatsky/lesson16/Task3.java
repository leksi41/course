package by.itland.itjava.bulatsky.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int index = 0;
        while (true) {
            String value = scanner.next();
            if (value.equalsIgnoreCase("end")) {
                break;
            }
            Integer integerValue = Integer.valueOf(value);
            if (integerValue > 0)
                list.add(integerValue);
            else if (integerValue < 0){
                list.add(index++, integerValue);
            }
            else {
                list.add(index, integerValue);
            }
        }
        System.out.println(list);
    }


}
