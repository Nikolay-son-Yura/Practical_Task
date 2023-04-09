package Homework.lesson1;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n),

import java.util.Scanner;

public class Task1_1 {
    public static void triangular() {
        String mask = "%s %s %n";
        String inscription = "Треугольное число:";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scanner.nextInt();
        System.out.printf(mask, inscription, Number(i));
    }

    public static int Number(int a) {
        return (a * (a + 1)) / 2;
    }
}

