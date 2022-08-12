package com.jdk8.lyl.stream;

import com.jdk8.lyl.model.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// 在实际开发中,map和reduce经常放到一起使用
public class Stream15MapAndReduce {

    public static void main(String[] args) {
        // 求出所有年龄的总和
        List<Teacher> list = new ArrayList<Teacher>(){
            {
                add(new Teacher("aa","12"));
                add(new Teacher("bb","13"));
                add(new Teacher("cc","14"));
                add(new Teacher("bb","12"));
                add(new Teacher("cc","13"));
            }
        };
        // 分析：先类型转换,取出所有的年龄【map】, 在将年龄加起来【reduce】
//        Optional<Integer> reduce = list.stream().
//                                        map(t -> Integer.parseInt(t.getGrade())).
//                                        reduce(
//                                            (x, y) -> {
//                                                return x + y;
//                                            }
//                                        );
//        Optional<Integer> reduce = list.stream().
//                                    map(t -> Integer.parseInt(t.getGrade())).
//                                    reduce(
//                                            (x, y) -> {
//                                                return x + y;
//                                            }
//                                    );

        Optional<Integer> reduce = list.stream().
                map(t -> Integer.parseInt(t.getGrade())).
                reduce(Integer::sum);
        System.out.println("所有老师的grade之和是:"+reduce.get());
    }
}
