package org.izhurko.collectionapi.task1;

import java.util.HashMap;
import java.util.Map;

class ArrayProcessor {

    public int[] findIndices(Integer[] array, int intendedNumber) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], i);
        }

        for (int i = 0; i < array.length; i++) {
            int requiredNumber = intendedNumber - array[i];  // 9-2 = 7

            if (map.containsKey(requiredNumber) && map.get(requiredNumber) != i) {
                return new int[]{i, map.get(requiredNumber)};
            }
        }
        throw new IllegalArgumentException("No solution");
    }
}
