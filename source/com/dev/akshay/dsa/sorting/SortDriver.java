package com.dev.akshay.dsa.sorting;

import java.util.Arrays;

public class SortDriver
{
    static Sort<Integer> selectionSort = new SelectionSort<>();
    static Sort<Integer> bubbleSort = new BubbleSort<>();
    static Sort<Integer> insertionSort = new InsertionSort<>();

    public static Integer[] sort(Integer[] array, String type)
    {
        switch (type)
        {
            case "selection_sort":
                array = selectionSort.sort(array);
                break;
            case "bubble_sort":
                array = bubbleSort.sort(array);
                break;
            case "insertion_sort":
                array = insertionSort.sort(array);
                break;
        }
        return array;
    }

    public static void main(String[] args)
    {
        String sortKey = "insertion_sort";

        Integer[] array = {1,4,6,8,3,9,7};
        array = sort(array, sortKey);
        System.out.println(Arrays.toString(array));

        Integer[] array2 = {13,46,24,52,20,9};
        array2 = sort(array2, sortKey);
        System.out.println(Arrays.toString(array2));

        Integer[] array3 = {5,4,3,2,1};
        array3 = sort(array3, sortKey);
        System.out.println(Arrays.toString(array3));
    }
}