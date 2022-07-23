package org.izhurko.collectionapi.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class DuplicatesCounter {

    public Map<Integer, Integer> count(Integer[] initArray) {
        List<Integer> initList = Arrays.asList(initArray);
        Set<Integer> uniqueOccurrences = new HashSet<>(initList);

        Map<Integer, Integer> duplicates = new HashMap<>();

        int occurrences;

        for (Integer entry : uniqueOccurrences) {
            occurrences = Collections.frequency(Arrays.asList(initArray), entry);
            if (occurrences >= 2) {
                duplicates.put(entry, occurrences);
            }
        }

        return duplicates;
    }
}
