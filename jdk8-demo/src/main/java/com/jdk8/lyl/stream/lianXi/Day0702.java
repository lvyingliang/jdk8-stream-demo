package com.jdk8.lyl.stream.lianXi;

import com.jdk8.lyl.model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Day0702 {

    public static void main(String[] args) {

//        Day0702.arrayGetStream();
//        Day0702.collectionGetStream();
        Day0702.pojoDistinctAndMap();


    }

    /**
     * 数据获取stream的两种方式
     */
    public static void arrayGetStream(){
        String[] strs = new String[]{"1","2","3"};
        Arrays.stream(strs).filter(s -> {
            System.out.println("只有调用终结方法，才会执行该输出语句");
            return "2".equals(s);
        }).forEach(System.out::println);

        String[] strs2 = new String[]{"1","2","3"};
        Stream<String> strs2Stream = Stream.of(strs2).filter(s -> {
            System.out.println("不调用终结方法，不会执行该输出语句");
            return "2".equals(s);
        });
    }

    public static void collectionGetStream(){
        List<String> list = Arrays.asList("1","2","3");
        list.stream().limit(2).forEach(System.out::println);

        System.out.println("list2,map and sorted【正序】------------------->");
        List<String> list2 = Arrays.asList("11","52","6","3","25","11","6","25");
        list2.stream().map(Integer::parseInt).sorted(Integer::compareTo).forEach(System.out::println);


        System.out.println("list2,map and distinct and sorted【倒叙】------------------->");
        List<String> list3 = Arrays.asList("11","52","6","3","25","11","6","25");
        list3.stream().map(Integer::parseInt).distinct().sorted(((o1, o2) -> o2 - o1)).forEach(System.out::println);

    }

    public static void pojoDistinctAndMap(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("b",24));
        list.add(new Person("c",11));
        list.add(new Person("b",11));
        list.add(new Person("a",6));
        list.add(new Person("a",11));

        // 排序
        list.stream().sorted(((o1, o2) -> {
            if(o1.getName().compareTo(o2.getName()) == 0){
                return o1.getAge() - o2.getAge();
            }else{
                return o1.getName().compareTo(o2.getName());
            }
        })).forEach(System.out::println);
    }
}
