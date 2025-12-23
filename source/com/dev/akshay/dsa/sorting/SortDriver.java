package com.dev.akshay.dsa.sorting;

import java.util.Arrays;

public class SortDriver
{
    static Sort<Integer> selectionSort = new SelectionSort<>();

    public static Integer[] sort(Integer[] array, String type)
    {
        switch (type)
        {
            case "selection_sort":
                array = selectionSort.sort(array);
                break;
        }
        return array;
    }

    public static void main(String[] args)
    {
        Integer[] array = {1,4,6,8,3,9,7};
        array = sort(array, "selection_sort");
        System.out.println(Arrays.toString(array));

        Integer[] array2 = {13,46,24,52,20,9};
        array2 = sort(array2, "selection_sort");
        System.out.println(Arrays.toString(array2));

        Integer[] array3 = {5,4,3,2,1};
        array3 = sort(array3, "selection_sort");
        System.out.println(Arrays.toString(array3));
    }
}