package org.example.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        /**
         * prior Java 8
         */


        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of the comparator is :" + comparator.compare(3,2));

        /**
         *  Java 8 lambda
         */

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("Result of comparator lambda is :" + comparatorLambda.compare(1,10));
        };


    }

