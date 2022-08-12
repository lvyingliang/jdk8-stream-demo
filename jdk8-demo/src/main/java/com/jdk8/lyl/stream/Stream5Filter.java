package com.jdk8.lyl.stream;

import java.util.stream.Stream;

// Filter：过滤
public class Stream5Filter {

    public static void main(String[] args) {
        // Stream<T> filter(Predicate<? super T> predicate);
        Stream<String> stringStream1 = Stream.of("abc", "abcd", "adds","dsga");
        long count = stringStream1.filter(s->{
            // return是不可缺少的
            return s.contains("d");
        }).count();
        System.out.println(count);
    }
}
