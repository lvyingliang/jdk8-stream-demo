package com.jdk8.lyl.stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

// reduce:  将所有数据归纳得到一个数据:比如list<int>求和
public class Stream14Reduce {

    public static void main(String[] args) {
//         T reduce(T identity, BinaryOperator<T> accumulator);
//        Optional<T> reduce(BinaryOperator<T> accumulator);
//        <U> U reduce(U identity,
//                BiFunction<U, ? super T, U> accumulator,
//                BinaryOperator<U> combiner);
        List<Integer> list = new ArrayList<Integer>() ;
        list.add(13);
        list.add(2);
        list.add(6);


        // identity: 初始值,为空时等效于为0
        // 流程：每次都会把上次返回的值，赋给下次的x

//        Optional<Integer> sum = list.stream().reduce((x, y) -> {
//            System.out.println("x=" + x + ",y=" + y);
//            return x + y;
//        });
//        System.out.println(sum.get());  // 21   2+6+13

//        Integer sum = list.stream().reduce(10, (x, y) -> {
//            System.out.println("x=" + x + ",y=" + y);
//            return x + y;
//        });
//        System.out.println(sum); // 31   10+2+6+13

        // 可以取出最大值
        Optional<Integer> sum = list.stream().reduce((x, y) -> {
            System.out.println("x=" + x + ",y=" + y);
            return x > y ? x : y;
        });
        System.out.println(sum.get()); // 31   10+2+6+13
    }
}
