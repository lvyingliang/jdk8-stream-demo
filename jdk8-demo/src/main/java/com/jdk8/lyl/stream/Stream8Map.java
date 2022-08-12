package com.jdk8.lyl.stream;

import java.util.stream.Stream;

// map: 如果需要将一个流中的数据  映射到 另一个stream中，可以使用map
//      该接口需要一个Function函数式接口参数，可以将当前流中的T类型数据转换成另一种R类型数据
public class Stream8Map {
    public static void main(String[] args) {
        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
        Stream<String> stringStream1 = Stream.of("1", "2", "3","4");
//        stringStream1.map(s->Integer.parseInt(s)).forEach(System.out::println);
        stringStream1.map(Integer::parseInt).forEach(System.out::println);

    }
}
