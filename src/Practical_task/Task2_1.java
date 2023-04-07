package Practical_task;
//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//        (через FileWriter).
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Task2_1 {
    private static final Logger logger = Logger.getLogger(Task2_1.class.getName());

    public static void printArray() throws IOException {
        FileHandler fh = new FileHandler("log.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        int[] newArray = arrayCreation();
        logger.info("Исходный массив: " + Arrays.toString(newArray));
        int[] sortArray = bubbleSort(newArray);
        logger.info("Отсортированный массив: " + Arrays.toString(sortArray));
    }
        public static int[] bubbleSort (int[] array){
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                logger.info("Промежуточный результат на " + (i + 1) + "-й итерации: " + Arrays.toString(array));
            }
            return array;
        }

    public static int[] arrayCreation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int num = scanner.nextInt();
        int[] arr;
        arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}












