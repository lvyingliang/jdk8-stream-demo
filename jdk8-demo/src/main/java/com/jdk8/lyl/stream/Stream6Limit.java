package com.jdk8.lyl.stream;


import java.util.stream.Stream;

// limit：截取,参数是long类型,如果当前集合长度小于limit参数，不截取
public class Stream6Limit {

    public static void main(String[] args) {

        Stream<String> stringStream1 = Stream.of("abc", "abcd", "adds","dsga");
        stringStream1.limit(6).forEach(System.out::println);

    }
}
