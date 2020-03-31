package com.design.pattern.dynamic.dcglib;

import java.util.Arrays;

/**
 * @author: jie.luo
 * @create: 2020-04-01 01:24
 */
public class ArraySort {

    /**
     * 快速排序
     *
     * @param arr
     */
    public void quickSort(int[] arr) {
        Arrays.sort(arr);
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = 0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
