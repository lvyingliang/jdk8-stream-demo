package com.jdk8.lyl.stream;

import java.util.stream.Stream;
// match： 终结函数，返回boolean，判断集合是否满足条件
public class Stream11Match {

    public static void main(String[] args) {

//        boolean anyMatch(Predicate<? super T> predicate);  任意一个满足条件即返回true
//        boolean allMatch(Predicate<? super T> predicate);  全满足条件返回true
//        boolean noneMatch(Predicate<? super T> predicate); 全不满足条件返回true
        Stream<String> stringStream1 = Stream.of("11", "5", "11","2","3","2");
//        boolean b = stringStream1.allMatch(s -> Integer.parseInt(s) > 3); 等效于下面
        boolean b = stringStream1.map(Integer::parseInt).allMatch(s -> s > 3);
        System.out.println(b);
    }


    public void anyMatch(){

    }
}
