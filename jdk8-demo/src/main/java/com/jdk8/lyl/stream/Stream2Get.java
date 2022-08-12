package com.jdk8.lyl.stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// stream流的获取方式：stream只存在集合接口下，固map、数据均不可直接获取到stream对象
public class Stream2Get {

    public static void main(String[] args) {


        Stream2Get.getStreamByArray();
    }


    // 获取Collection接口下的流对象
    private void getStreamByCollection(){
        // Collection接口下的所有实现类，都可以获取流对象

        // list集合:同样的还有Set、Vector
        List<String> list = new ArrayList<>();
        list.stream();
    }

    // 获取Map接口下的流对象
    private void getStreamByMap(){
        // map接口下的实现类不能获取Stream对象，但是可以通过获取key集合的流对象和value集合的流对象
        Map<String,Object> map = new HashMap<>();
        // 1.key集合的stream对象
        Stream<String> keysStream = map.keySet().stream();
        // 2.value集合的stream对象
        Stream<Object> valuesStream = map.values().stream();
        // 3.entry的stream对象
        Stream<Map.Entry<String, Object>> stream = map.entrySet().stream();
    }

    // 获取数据的流对象
    public static void getStreamByArray(){
        // 通过of获取stream对象/Arrays.stream()
        Stream<String> stringStream = Stream.of("1", "2", "3");

        String[] strs = {"aa", "bb", "cc"};
        Stream<String> strsStream = Stream.of(strs);
        strsStream.forEach(System.out::println);

        Integer[] integers = {1, 2, 3};
        Stream<Integer> integersStream = Stream.of(integers);
        integersStream.forEach(System.out::println);

        // 基本数据类型会被当成一个整体输出： int dobule long等,需要使用Arrays.stream来处理
        int[] ints = {1, 2, 3};
        Stream<int[]> intsStream = Stream.of(ints);
        intsStream.forEach(System.out::println);

        IntStream stream = Arrays.stream(ints);
        stream.forEach(System.out::println);
    }
}
