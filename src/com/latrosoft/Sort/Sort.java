package com.latrosoft.Sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
    int[] arr;

    public Sort(int[] arr) {
        this.arr = arr;
    }

    public void insertionSort() {
        for (int i = 1; i < arr.length; i++) {
                int value = arr[i];
            int hole = i;
            while (hole > 0 && arr[hole - 1] > value) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = value;
        }
    }

    public void selectionSort() {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag != 1) break;
        }
    }

    public int[] mergeSort(int m[]) {
        if (m.length == 1) {
            return m;
        }
        int mid = m.length / 2;
        int left[] = Arrays.copyOfRange(m, 0, mid);
        int right[] = Arrays.copyOfRange(m, mid, m.length);
        return merge(this.mergeSort(left), this.mergeSort(right));

    }

    private int[] merge(int[] left, int[] right) {
        int mix[] = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

    public int[] getArr() {
        return arr;
    }

    public void printArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
