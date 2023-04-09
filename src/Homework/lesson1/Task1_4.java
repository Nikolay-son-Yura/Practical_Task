package Homework.lesson1;

import java.util.Scanner;

//Реализовать простой калькулятор
public class Task1_4 {
    public static void calculator() {
        double rez = 0;
//        String mask = "%s %s=%s%n";


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 число");
        double numb1= scanner.nextDouble();
        System.out.println("Введите действие(+,-,*,/)");
        char op = scanner.next().charAt(0);
        System.out.println("Введите 2 число");
        double numb2= scanner.nextDouble();
        switch (op){
            case '+': rez = numb1 + numb2;
            break;
            case '-': rez = numb1 - numb2;
            break;
            case '*': rez = numb1 * numb2;
            break;
            case '/': rez = numb1 / numb2;
            break;
        }
        System.out.printf(numb1 + " " + op + " " + numb2 + " = " + rez);

    }
}
