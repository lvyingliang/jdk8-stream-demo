package com.jdk8.lyl.stream;

import java.util.stream.Stream;

public class Stream17Concat {

    public static void main(String[] args) {
        // concat: 将两个stream合并成一个
        String[] str1 = {"1","2","3"};
        String[] str2 = {"x","y","z"};
        Stream.concat(Stream.of(str1),Stream.of(str2)).forEach(System.out::println);
    }
}
