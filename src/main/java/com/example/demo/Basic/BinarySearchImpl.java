package com.example.demo.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private ISortAlgorithm bubbleSort;

    public int binarySearch(int[] numbers, int numberToSearchFor) {
        int[] sortedNumbers = bubbleSort.sort(numbers);
        return 3;
    }
}
