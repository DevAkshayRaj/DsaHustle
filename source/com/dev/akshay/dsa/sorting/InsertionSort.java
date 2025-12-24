package com.dev.akshay.dsa.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort<K> implements Sort<K>
{
    SortUtil<K> sortUtil = new SortUtil<>();

    @Override
    public K[] sort(K[] array) {
        System.out.println("Input : " + Arrays.toString(array));
        for (int i=1; i < array.length; i++)
        {
            K temp = array[i];
            int j = i-1;
            for (; j >= 0; j--)
            {
                if(sortUtil.greaterThan(array[j],temp))
                {
                    array[j+1] = array[j];
                }
                else
                {
                    break;
                }
            }
            if(j>=-1) {
                array[j+1] = temp;
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }
}
