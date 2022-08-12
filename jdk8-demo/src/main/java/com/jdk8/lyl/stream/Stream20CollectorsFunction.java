package com.jdk8.lyl.stream;

import com.jdk8.lyl.model.Person;
import com.jdk8.lyl.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream20CollectorsFunction {

    public static void main(String[] args) {
        Optional<Person> collect = Stream.of(
                new Person("张三", 20),
                new Person("李四", 21),
                new Person("王五", 23),
                new Person("李四", 21)
        ).collect(Collectors.maxBy((t1, t2) -> Integer.compare(t1.getAge(),t2.getAge())));
        System.out.println("最大年龄的对象信息:"+collect.get());


        Optional<Person> collect2 = Stream.of(
                new Person("张三", 20),
                new Person("李四", 21),
                new Person("王五", 23),
                new Person("李四", 21)
        ).collect(Collectors.minBy((t1, t2) -> Integer.compare(t1.getAge(),t2.getAge())));
        System.out.println("最小年龄的对象信息:"+collect2.get());

        // 求和
        Integer collect3 = Stream.of(
                new Person("张三", 20),
                new Person("李四", 21),
                new Person("王五", 23),
                new Person("李四", 21)
        ).collect(Collectors.summingInt(s -> s.getAge()));
        System.out.println("年龄总和是:"+collect3);

        // 平均值
        Double collect4 = Stream.of(
                new Person("张三", 20),
                new Person("李四", 21),
                new Person("王五", 23),
                new Person("李四", 21)
        ).collect(Collectors.averagingInt(Person::getAge));
        System.out.println("平均值是:"+collect4);

    }
}
