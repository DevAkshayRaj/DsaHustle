package com.dev.akshay.dsa.sorting;

import java.math.BigDecimal;

public class SortUtil<K>
{
    public boolean greaterThan(K eleOne, K eleTwo)
    {
        if(eleOne instanceof Integer && eleTwo instanceof Integer)
        {
            return Integer.parseInt(String.valueOf(eleOne)) > Integer.parseInt(String.valueOf(eleTwo));
        }
        return false;
    }

    public boolean lesserThan(K eleOne, K eleTwo)
    {
        if(eleOne instanceof Integer && eleTwo instanceof Integer)
        {
            return Integer.parseInt(String.valueOf(eleOne)) < Integer.parseInt(String.valueOf(eleTwo));
        }
        return false;
    }

    public boolean equals(K eleOne, K eleTwo)
    {
        if(eleOne instanceof Integer && eleTwo instanceof Integer)
        {
            return Integer.parseInt(String.valueOf(eleOne)) == Integer.parseInt(String.valueOf(eleTwo));
        }
        return false;
    }
}
