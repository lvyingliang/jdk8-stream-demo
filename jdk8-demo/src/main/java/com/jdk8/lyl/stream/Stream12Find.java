package com.jdk8.lyl.stream;

import java.util.Optional;
import java.util.stream.Stream;
// find: 如果需要找到某些数据,可以使用find
public class Stream12Find {

    public static void main(String[] args) {
//        Optional<T> findFirst();
//        Optional<T> findAny();
        Stream<String> stringStream1 = Stream.of("11", "5", "12","2","3","2");
//        System.out.println(stringStream1.findAny().get());
        System.out.println(stringStream1.findFirst().get());
    }
}
