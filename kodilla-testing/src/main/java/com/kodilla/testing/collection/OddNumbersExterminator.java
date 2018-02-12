package com.kodilla.testing.collection;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;

public class OddNumbersExterminator {
    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        for(Integer number : numbers) {
            if(number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public static void main (String[] args) {
        OddNumbersExterminator ext = new OddNumbersExterminator();
        System.out.println(ext.exterminate(new ArrayList<Integer>(Arrays.asList(3, 5, 6, 9, 10))));
    }
}
