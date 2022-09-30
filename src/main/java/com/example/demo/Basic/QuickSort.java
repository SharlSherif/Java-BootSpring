package com.example.demo.Basic;

import org.springframework.stereotype.Component;

@Component
public class QuickSort implements ISortAlgorithm {
    public int[] sort(int[] numbersToSort) {
        System.out.print("QuickSort");
        return numbersToSort;
    }
}
