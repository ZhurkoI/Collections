package org.izhurko.collectionapi.task2;

import java.util.Map;

class Main {

    public static void main(String[] args) {
        Integer[] initArray = {4, 5, 6, 6, 8, 1, 1, 6};
//        Integer[] initArray = {4, 5, 6};
        DuplicatesCounter counter = new DuplicatesCounter();

        Map<Integer, Integer> duplicates = counter.count(initArray);

        print(duplicates);
    }

    static void print(Map<Integer, Integer> duplicates) {
        boolean isDuplicatesExist = false;

        if (duplicates.size() > 0) {
            for (Map.Entry<Integer, Integer> entry : duplicates.entrySet()) {
                if (isDuplicatesExist == false) {
                    isDuplicatesExist = true;
                    System.out.println("Result: true");
                }
                System.out.println("Number " + entry.getKey() + " has " + entry.getValue() + " entries");
            }
        } else {
            System.out.println("There is no duplicates in the initial array.");
        }
    }
}
