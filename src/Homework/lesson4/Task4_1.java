package Homework.lesson4;

import java.util.Collections;
import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Task4_1 {
    public static void reverseList() {
        int[] listSim = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer item : listSim) {
            linkList.add(item);
        }
        System.out.println("изначальный список" + linkList);
        Collections.reverse(linkList);
        System.out.println("перевернутый список" + linkList);

    }


}
