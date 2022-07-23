package org.izhurko.collectionapi.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayProcessor {

    public List<Integer> findIndices(Integer[] array, int intendedNumber) {
        List<Integer> list = new ArrayList<>(Arrays.asList(array));  // converting initial array to a MUTABLE list
        int diff;
        
        List<Integer> result = new ArrayList<>();
        for (Integer element : list) {
            diff = intendedNumber - element;
            if (list.contains(diff)) {
                result.add(list.indexOf(element));
                result.add(list.indexOf(diff));
                break;
            }
        }
        return result;
    }
}
