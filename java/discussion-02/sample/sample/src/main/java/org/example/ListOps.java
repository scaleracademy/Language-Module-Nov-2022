package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListOps {

    public static void main(String[] args) {
        List<String> list = List.of("a", "4", "k", "9", "n", "5", "t");

        List<Integer> numbers = new ArrayList<>();
        list.forEach(s -> {
            try {
                numbers.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                // ignore
            }
        });

        List<Integer> squareList = new ArrayList<>();
        numbers.forEach(n -> {
            squareList.add(n * n);
        });

        System.out.println(squareList);

        list.stream()
            .map(s -> {
                try {
                    return Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    return null;
                }
            })
            .filter(Objects::nonNull)
            .map(n -> {
                return n * n;
            })
            .forEach(System.out::println);

    }
}
