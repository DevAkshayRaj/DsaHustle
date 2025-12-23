package com.dev.akshay.dsa.sorting;

public class SelectionSort<K> implements Sort<K>
{
    SortUtil<K> sortUtil = new SortUtil<>();

    @Override
    public K[] sort(K[] array) {

        for (int i=0; i < array.length; i++)
        {
            K key = array[i];
            int minIndex = -1;
            for (int j=i+1; j < array.length;j++)
            {
                if(sortUtil.lesserThan(array[j], key))
                {
                    minIndex = j;
                    key = array[j];
                }
            }
            if(minIndex != -1) {
                K temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

            //System.out.println(Arrays.toString(array));
        }

        return array;
    }
}