package com.jdk8.lyl.stream.lianXi;

import com.jdk8.lyl.model.Teacher;

import java.util.*;

public class Day0626 {

    public static void main(String[] args) {
//        Day0626.getStreamByArrays();
//        Day0626.getStreamByMap();
//        Day0626.filterAndCount();
//        Day0626.sortedAndMap();
//        Day0626.distinct();
//        Day0626.match();
        Day0626.maxAndMin();
    }

    private static void getStreamByArrays(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("13");
        list.add("31");
        list.add("51");
        list.stream().forEach(System.out::println);
    }

    private static void getStreamByMap(){
        Map<String,String> map = new HashMap<>();
        map.put("age","18");
        map.put("name","tom");
        map.keySet().stream().map(s -> {
            switch (s){
                case "age":
                    return "this key is age:"+map.get(s);
                case "name":
                    return "this key is name"+map.get(s);
                default:
                    return "0";
            }
        }).forEach(System.out::println);
    }


    private static void filterAndCount(){
        List<String> list = new ArrayList<>(Arrays.asList("sf2","123da","26dgh","353fcj","dg234sd","jkvc3","sdf2","df5"));
        long d = list.stream().filter(s -> s.contains("d")).count();
        System.out.println("包含d的数量为:"+d);
    }

    private static void sortedAndMap(){
        List<String> list = new ArrayList<>(Arrays.asList("2323","456","33","25","45","3","53","34"));
        // 升序
        list.stream().map(Integer::parseInt).sorted((o1,o2)-> o1-o2).forEach(System.out::println);
        list.stream().map(Integer::parseInt).sorted((o1,o2)-> o1.compareTo(o2)).forEach(System.out::println);
        // 降序
        list.stream().map(Integer::parseInt).sorted((o1,o2)-> o2-o1).forEach(System.out::println);
        list.stream().map(Integer::parseInt).sorted((o1,o2)-> o2.compareTo(o1)).forEach(System.out::println);
    }


    private static void distinct(){
        // distinct 如果集合的内容是对象，那么对象需要重写equal 和 hashcode方法
        List<Teacher> list = new ArrayList<Teacher>(){
            {
                add(new Teacher("aa","1"));
                add(new Teacher("bb","1"));
                add(new Teacher("cc","1"));
                add(new Teacher("bb","1"));
                add(new Teacher("cc","1"));
            }
        };

        list.stream().distinct().forEach(System.out::println);
    }


    // 返回boolean
    private static void match(){
        List<String> list = new ArrayList<>(Arrays.asList("23223","2456","323","25","245","23","523","324"));
        System.out.println(list.stream().anyMatch(s -> s.contains("3")));
    }

    // max(Comparator):取出根据比较器比较好顺序的最后一个对象
    // min(Comparator)：取出根据比较器比较好顺序的第一个对象
    private static void maxAndMin(){
        List<String> list = new ArrayList<>(Arrays.asList("2323","456","33","25","45","3","53","34"));
        // 返回Optional对象,通过get方法获取最大值
        Optional<Integer> max = list.stream().map(Integer::parseInt).max((o1, o2) -> o2.compareTo(o1));
        System.out.println("最大值是:"+max.get());
    }
}
