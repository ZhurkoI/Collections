package org.izhurko.collectionapi.task1;

import java.util.Arrays;
import java.util.List;

class Main {

    public static void main(String[] args) {
        Integer[] initArray = {3, 8, 15, 17, 1};   // only unique integers are allowed in the array
        int intendedNumber = 9;

        ArrayProcessor arrayProcessor = new ArrayProcessor();
        List<Integer> indices = arrayProcessor.findIndices(initArray, intendedNumber);
        System.out.println("Initial array = " + Arrays.toString(initArray));
        System.out.println("Result = " + indices);
    }
}
