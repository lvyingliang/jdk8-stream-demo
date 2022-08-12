package com.jdk8.lyl.stream;

import java.util.stream.Stream;

// 统计流中的数量
public class Stream4Count {

    public static void main(String[] args) {
        // long count():不需要声明临时变量记录个数
        Stream<String> stringStream1 = Stream.of("abc", "abcd", "adds","dsga");
        long count = stringStream1.filter(s->{
            // return是不可缺少的
            return s.contains("d");
        }).count();
        System.out.println(count);
    }
}
