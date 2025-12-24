package com.dev.akshay.dsa.sorting;

public class BubbleSort<K> implements Sort<K>
{
    public SortUtil<K> sortUtil = new SortUtil<>();

    @Override
    public K[] sort(K[] array)
    {
        int n = array.length;
        for (int i=n-1; i>=0; i--)
        {
            boolean didSwap = false;
            for (int j=0; j<i; j++)
            {
                if(sortUtil.greaterThan(array[j], array[j+1]))
                {
                    K temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    didSwap = true;
                }
            }
            //If swap not occurs in the first try then the array is already sorted
            if(!didSwap)
            {
                break;
            }
        }
        return array;
    }
}
