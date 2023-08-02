package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(12, 4, 84, 5, 9, 78, 12);
//        Predicate<Integer> predicate=new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer%2==1;
//                //return false;
//            }
//        };

//        Function<Integer,Integer> function=new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer*2;
//            }
//        };

//        BinaryOperator<Integer> binaryOperator=new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                System.out.println(integer+"+  "+integer2);
//                return integer+integer2;
//            }
//        };
//
//        Stream<Integer> stream=nums.stream();
//        Stream<Integer> stream1=stream.filter(n -> n%2==1);
//        Stream<Integer> stream2=stream1.map(n -> n*2);
//      int result=  stream2.reduce(0,((integer, integer2) -> integer+integer2));
//
//       // stream2.forEach(n -> System.out.println(n));
//        System.out.println(result);

        BinaryOperator<Integer> bi = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                System.out.println(integer);
                return integer + integer2;
            }
        };
        int result = nums.parallelStream()
                .filter(n -> n % 2 == 1)
                .map(n -> n * 2)
                .reduce(0, bi);
        System.out.println(result);

    }
}
