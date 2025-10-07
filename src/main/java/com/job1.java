package com;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class job1 {

    public static String getStringFromStream(Stream<String> stringStream) {
        return stringStream.collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("Good", "morning", "Vladislav");
        String result = getStringFromStream(stream);
        System.out.println(result); // Результат: Good morning Vladislav
    }
}