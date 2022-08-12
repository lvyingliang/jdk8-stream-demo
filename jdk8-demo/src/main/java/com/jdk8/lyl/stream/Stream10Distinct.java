package com.jdk8.lyl.stream;

import com.jdk8.lyl.model.Person;

import java.util.stream.Stream;

// distinct:去掉重复记录
public class Stream10Distinct {

    public static void main(String[] args) {
        // 优势：不需要使用contain了
        Stream<String> stringStream1 = Stream.of("11", "5", "11","2","3","2");
        stringStream1.sorted().distinct().forEach(System.out::println);

        // 对象集合类型的去重：需要重写equal方法和hashCode方法
        Stream.of(
                new Person("张三",20),
                new Person("李四",21),
                new Person("王五",23),
                new Person("李四",21)
        ).distinct().forEach(System.out::println);
    }
}
