package com.jdk8.lyl.stream;

import java.util.stream.Stream;

// forEach作用： 遍历
public class Stream3ForEach {


    public static void main(String[] args) {
        // void forEach(Consumer action)
        Stream<String> stringStream1 = Stream.of("abc", "abcd", "adds","dsga");
        stringStream1.filter(s->{
            System.out.println("输出语句---------调用终结方法，中间步骤执行");
            // return是不可缺少的
            return s.contains("d");
        }).forEach(System.out::println); // System.out::println相当于lambda表达式
    }
}
