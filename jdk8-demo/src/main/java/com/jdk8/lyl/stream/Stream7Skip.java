package com.jdk8.lyl.stream;

import java.util.stream.Stream;

// skip：跳过前面n个数值
public class Stream7Skip {

    public static void main(String[] args) {
        Stream<String> stringStream1 = Stream.of("abc", "abcd", "adds","dsga");
        // 跳过前两个
        stringStream1.skip(2).forEach(System.out::println);
    }
}
