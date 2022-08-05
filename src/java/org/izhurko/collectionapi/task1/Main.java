package org.izhurko.collectionapi.task1;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        Integer[] initArray = {3, 8, 15, 17, 1};   // only unique integers are allowed in the array
        int intendedNumber = 9;

        ArrayProcessor arrayProcessor = new ArrayProcessor();
        int[] indices = arrayProcessor.findIndices(initArray, intendedNumber);
        System.out.println("Initial array = " + Arrays.toString(initArray));
        System.out.println("Result = " + Arrays.toString(indices));
    }
}
