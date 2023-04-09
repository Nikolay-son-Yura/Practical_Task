package Homework.lesson1;

import java.util.Scanner;

//n! (произведение чисел от 1 до n)
public class Task1_2 {
    public static double factor() {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numb = scaner.nextInt();
        return  factorial(numb);
    }
    public static double factorial(int numb) {
        if (numb==1)return 1;
        return numb * factorial(numb - 1);

    }
}
