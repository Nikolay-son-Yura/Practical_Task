package Homework.lesson4;

import java.util.LinkedList;
import java.util.Scanner;

//*Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
public class Task4_2 {

    public static void queueLinkedList() {
        int[] listSim = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        LinkedList<Integer> linkList = new LinkedList<>();

        for (Integer item : listSim) {
            linkList.add(item);
        }

        System.out.println(linkList);
        System.out.print("Введите команды для работы с LinkedList\nenqueue - для нового элемента в конец очереди,\ndequeue - для возвращения первого элемента из очереди и удаления его,\nfirst - для возвращения первого элемента из очереди, не удаляя.\nВвод : ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.equalsIgnoreCase("enqueue")) {
            System.out.println("Введите новый элимент");
            int number = Integer.parseInt(scanner.next());
            linkList.add(number);
            System.out.println(linkList);

        } else if (input.equalsIgnoreCase("dequeue")) {
            System.out.println(linkList.removeFirst());
            System.out.println(linkList);

        } else if (input.equalsIgnoreCase("first")) {
            System.out.println(linkList.getFirst());
            System.out.println(linkList);

        } else System.out.println("Не верно введена команда");
    }

}
