package Homework.lesson3;
//Пусть дан произвольный список целых чисел, удалить из него чётные числа


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task3_2 {
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

    public static List<Integer> delEven() {
        List<Integer> list = listCreation();
        System.out.println(list);
        list.removeIf(i-> (i%2)==0);// гугл наше все
        System.out.println(list);
        return list;
    }
}
