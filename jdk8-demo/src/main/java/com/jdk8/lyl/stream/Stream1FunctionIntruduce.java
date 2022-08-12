package com.jdk8.lyl.stream;

import java.util.stream.Stream;

public class Stream1FunctionIntruduce {

    public static void main(String[] args) {
        /**
         * 方法名     作用        返回值      方法种类
         * count     统计个数     long       终结
         * forEach   逐一处理     void       终结
         * filter    过滤        Stream     函数拼接
         * limit     取用前几个   Stream     函数拼接
         * skip      跳过几个     Stream     函数拼接
         * map       映射        Stream     函数拼接
         * concat    组合        Stream     函数拼接
         * match     匹配        boolean    终结
         * sum max min          Optional  对象
         * 终结： 返回类型不再是Stream，不支持链式调用
         * 非终结方法：返回值还是Stream，支持链式调用
         *
         * 注意事项：
         *  Stream只能操作一次
         *  Stream方法返回的是新的流
         *  Stream不调用终结方法，中间步骤不会执行
         */

        Stream1FunctionIntruduce.attentionThing();

    }

    // Stream不调用终结方法，中间步骤不会执行
    public static void attentionThing(){
        Stream<String> stringStream = Stream.of("abc", "abcd", "adds","dsga");
        stringStream.filter(s->{
            System.out.println("输出语句---------Stream不调用终结方法，中间步骤不会执行");
            return s.contains("dd");
        });
        System.out.println("隔行------------------------");

        Stream<String> stringStream1 = Stream.of("abc", "abcd", "adds","dsga");
        stringStream1.filter(s->{
            System.out.println("输出语句---------调用终结方法，中间步骤执行");
            return s.contains("d");
        }).forEach(System.out::println);

    }
}
