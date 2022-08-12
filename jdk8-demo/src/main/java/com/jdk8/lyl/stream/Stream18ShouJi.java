package com.jdk8.lyl.stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream18ShouJi {

    public static void main(String[] args) {
        // 收集到ArrayList中
        ArrayList<String> arrayList = Stream.of("a", "b", "c")
                //.collect(Collectors.toCollection(()->new ArrayList<>()));
                .collect(Collectors.toCollection(ArrayList::new));
        // 收集到HashSet中
        HashSet<String> hashSet = Stream.of("a", "b")
                .collect(Collectors.toCollection(HashSet::new));

    }
}
