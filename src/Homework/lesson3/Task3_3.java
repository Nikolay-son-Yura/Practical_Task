package Homework.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class Task3_3 {
    public static List<Integer> listCreation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка : ");
        int num = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < num; i++) {
            list.add(rd.nextInt(1, 101));
        }
        return list;

    }

    public static void averageMaxMin() {
        List<Integer> list = listCreation();
        int max = list.get(0);
        int min = list.get(0);
        int sum = 0;
        for (int item : list) {
            if(item>max) {
            max=item;
            }
            if(item<min){
                min=item;
            }
            sum+=item;
        }
        double average =  ((double) sum / list.size());//float округляет
        System.out.println("Список :" + list);
        System.out.println("Максимальный элимент :" + max);
        System.out.println("Минимальный элимент :" + min);
        System.out.println("Среднее арифметическое:" + average);
    }
}


