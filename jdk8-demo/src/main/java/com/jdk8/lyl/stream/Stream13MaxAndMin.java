package com.jdk8.lyl.stream;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

// max：获取最大值、min：获取最小值
public class Stream13MaxAndMin {

    public static void main(String[] args) {
//        Optional<T> min(Comparator<? super T> comparator);
//        Optional<T> max(Comparator<? super T> comparator);

        // 内部先排序，后取出最大值和最小值
        Stream<String> stringStream1 = Stream.of("11", "5", "12","2","3","2");
        Stream<String> stringStream2 = Stream.of("11", "5", "12","2","3","2");
        Optional<String> max1 = stringStream1.max(String::compareTo);
        Optional<String> max2 = stringStream2.max((o1,o2)->{
            return o2 .compareTo(o1);
        });
        System.out.println(max1.get());
        System.out.println(max2.get());


//        System.out.println(stringStream1.min());
    }

}
