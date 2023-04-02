package Practical_task;

//Вывести все простые числа от 1 до 1000.
// простое число - то число которое делится без остатка только на 1 и на само себя
// (1 - это не простое число);
public class Task3 {
    public static void simple() {
        boolean flag = true;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.print(i);
            else flag = true;
        }
    }
}
