package com.coderx;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] sumNumbers = {1,2,3,4};
        int key = 0;

        process(sumNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] sumNumbers, int key, BiConsumer<Integer, Integer> consumer){
        for(int i : sumNumbers){
            consumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
        return (v, k) -> {

            try{
                consumer.accept(v, k);
            }catch (Exception ex){
                System.out.println(ex.getMessage());
            }
        };
    }
}
