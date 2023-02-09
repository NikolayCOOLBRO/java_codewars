package org.kata.listFiltering;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public static List<Object> filterList(final List<Object> list){
        var result = new ArrayList<Object>();

        for(var item : list){
            if(!item.getClass().equals(String.class)){
                result.add(item);
            }
        }

        return  result;
    }
}
