package com.jdk8.lyl.stream;


import java.util.stream.Stream;

// sorted：对数据进行排序
public class Stream9Sorted {

    public static void main(String[] args) {
        // Stream<T> sorted(); 根据自然顺序排序
        Stream<String> stringStream1 = Stream.of("11", "5", "3","2");
        stringStream1.sorted().forEach(System.out::println);

        // Stream<T> sorted(Comparator<? super T> comparator); 可以传入自定义排序规则
        Stream<String> stringStream2 = Stream.of("11", "5", "3","2");
        // 倒叙
//        stringStream2.sorted((o1,o2)->o2.compareTo(o1)).forEach(System.out::println);
        stringStream2.map(Integer::parseInt).sorted(Integer::compareTo).forEach(System.out::println);
        // 正序
//        stringStream2.sorted((o1,o2)->o1.compareTo(o2)).forEach(System.out::println);


    }
}
