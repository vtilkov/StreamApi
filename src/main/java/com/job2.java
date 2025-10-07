package com;

import java.util.ArrayList;
import java.util.Arrays;

public class job2 {

    public static void printList(ArrayList<Integer> list) {
        list.forEach((Integer element) -> System.out.println(element));
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,10,20,30,50,100));
        printList(numbers);

    }
}