package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements ISortAlgorithm {

    public int[] sort(int[] numbersToSort) {
        System.out.print("BubbleSort");
        return numbersToSort;
    }
}
