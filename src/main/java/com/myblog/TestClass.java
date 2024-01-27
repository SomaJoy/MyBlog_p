package com.myblog;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(33, 2, 4, 6, 73, 43, 6, 436, 6, 24, 4, 6, 4, 5);
        List<Integer> collect = data.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(1573);

    }
}
