package Practical_task;
//Реализовать алгоритм сортировки слиянием
//Я вроде как разобрался через рекурсию

import java.util.*;

public class Task3_1 {
    public static void printArray() {
        int[] arr = arrayCreation();
        System.out.println(Arrays.toString(arr));
        int[] sortArr = mergeSort(arr, arr.length);
        System.out.println(Arrays.toString(sortArr));
    }

    public static int[] mergeSort(int[] array, int size) {
        if (size < 2) {
            return array;
        }
        int mid = size / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[size - mid];
//        for (int i = 0; i < mid; i++) {
//            l[i] = a[i];
//        }
        System.arraycopy(array, 0, leftArr, 0, mid);// IDEA подсказала, оригинал оставил выше
//        for (int i = mid; i < n; i++) {
//            r[i - mid] = a[i];
//        }
        if (size - mid >= 0) System.arraycopy(array, mid, rightArr, 0, size - mid);// IDEA подсказала, оригинал оставил выше
        mergeSort(leftArr, mid);
        mergeSort(rightArr, size - mid);

        merge(array, leftArr, rightArr, mid, size - mid);
        return array;
    }

    public static void merge(int[] a, int[] leftArr, int[] rightArr, int leftMid, int rightMid) {

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftMid && j < rightMid) {
            if (leftArr[i] <= rightArr[j]) {
                a[k++] = leftArr[i++];
            } else {
                a[k++] = rightArr[j++];
            }
        }
        while (i < leftMid) {
            a[k++] = leftArr[i++];
        }
        while (j < rightMid) {
            a[k++] = rightArr[j++];
        }
    }

    public static int[] arrayCreation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}

