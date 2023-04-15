package Homework.lesson5;
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// и у человека уникальное имя. Поработать с методами Map.

import java.util.*;


public class Task5_1 {
    public static void book() {
        Map<String, ArrayList<String>> bookPhone = new HashMap<>();
        addNumber("Иванов", "+123", bookPhone);
        addNumber("Иванов", "1234", bookPhone);
        addNumber("Петров", "546585", bookPhone);
        addNumber("Сидоров", "8956477", bookPhone);
        addNumber("Иванов", "12356233", bookPhone);
        addNumber("Петров", "787897", bookPhone);
        addNumber("Викторов", "+7(983)2946957", bookPhone);
        printBook(bookPhone);
    }


    public static void addNumber(String key, String value, Map<String, ArrayList<String>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printBook(Map<String, ArrayList<String>> map) {
        for (Map.Entry<String, ArrayList<String>> item: map.entrySet()) {
            String phones = "";
            for (String el : item.getValue()) {
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
}


