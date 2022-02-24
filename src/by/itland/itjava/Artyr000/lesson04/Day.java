package by.itland.itjava.Artyr000.lesson04;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        printDay(day);
    }

    private static void printDay(int day) {
        switch (day)
        {
            case 1:
                System.out.println("понедельник");break;
            case 2:
                System.out.println("вторник");break;
            case 3:
                System.out.println("среда");break;
            case 4:
                System.out.println("четверг");break;
            case 5:
                System.out.println("пятница");break;
            case 6:
                System.out.println("суббота");break;
            case 7:
                System.out.println("воскресенье");break;
            default:
                System.out.println("Такого дня не существует");
        }
    }

    public static String getNameDay(int day){
        switch (day)
        {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "Такого дня не существует";
        }
    }
}
