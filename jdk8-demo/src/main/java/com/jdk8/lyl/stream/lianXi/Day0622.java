package com.jdk8.lyl.stream.lianXi;

import com.jdk8.lyl.model.Person;
import com.jdk8.lyl.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Day0622 {

    private static void streamMap(){
        // Map：类型转换,将Person转换为Teacher
        List<Person> list  = new ArrayList<>();
        list.add(new Person("吕小布",18));
        list.add(new Person("王小宁",31));
        list.add(new Person("胡小菲",29));
        list.add(new Person("曾小贤",24));

        list.stream().filter(person -> {
            return person.getAge() >= 20;
        }).map(person -> {
            if (person.getAge() > 30) {
                return new Teacher("高中", "高一");
            } else {
                return new Teacher("初中", "初三");
            }
        }).forEach(System.out::println);
    }

    private static void streamSorted(){
        // sorted: 传入比较器
        List<Person> list  = new ArrayList<>();
        list.add(new Person("吕小布",45));
        list.add(new Person("吕小布",5));
        list.add(new Person("王小宁",18));
        list.add(new Person("李小帅",31));
        list.add(new Person("胡小菲",29));
        list.add(new Person("曾小贤",24));
        list.add(new Person("吕小布",18));
        list.add(new Person("吕小布",17));
        list.add(new Person("吕小布",24));
        list.stream().sorted((p1,p2)->{
            int i = p1.getName().compareTo(p2.getName());
            if(i == 0){
                // 如果名称相同,根据排序
                return Integer.compare(p1.getAge(),p2.getAge());
            }else{
                return i;
            }
        }).forEach(System.out::println);


    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1564");
        list.add("abc");
        list.add("asds");
        list.add("abc");
        list.add("吕小布");
        list.add("235");
        list.add("x8s");
//        // filter：非终结函数,返回stream对象、 foreach：终结函数，返回void
//        String flag = "ab";
//        list.stream().filter(s->{
//            if("a".equals(flag)){
//                System.out.println("当前flag=a");
//                return s.contains("s");
//            }else{
//                System.out.println("当前flag!=a");
//                return s.contains("x");
//            }
//
//        }).forEach(System.out::println);


//        // count: 终结函数，返回long类型
//        long count = list.stream().filter(s -> s.length() > 3).count();
//        System.out.println(count);


        // map
        // LianXi.streamMap();


        // sort: 传入规则器 和 默认规则器
        // LianXi.streamSorted();

        // distinct:去重时,如果是对象集合,那么需要重写对象的equal和hashCode方法
        System.out.println("去重前长度:"+list.size());
        System.out.println("去重后长度:"+list.stream().distinct().count());




    }


}
