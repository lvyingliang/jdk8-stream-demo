package com.jdk8.lyl.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream16MapToInt {

    public static void main(String[] args) {
        // Integer占用的内存比较多【因为有装箱拆箱操作】
        Integer[] array = {1,2,3,4,5,6,7,8};
        // 为了提高效率，把Integer类型转换成int类型
        Stream.of(array).mapToInt(Integer::intValue).filter(i->i>3).forEach(System.out::println);

    }
}
 