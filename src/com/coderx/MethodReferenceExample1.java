package com.coderx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample1 {
    public static void main(String[] args) {
        //printMessage();

        // this is the normal behavior, but we can implement this using lambda
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                printMessage();
//            }
//        });
//
//        t.start();

//        Thread t = new Thread(MethodReferenceExample1::printMessage);
//        t.start();

        List<Person> people = Arrays.asList(
                new Person("Shenal", "Fernando",22),
                new Person("Pamudu","Prabathiya",22),
                new Person("Tharindu", "Dilshan",22),
                new Person("Pasan", "Jayasinghe", 22),
                new Person("Vajith", "Chamuditha",21),
                new Person("Ruchira", "Nishan",21)
        );

        performConditionally(people, p -> true, System.out::println);

    }
//    public static void printMessage(){
//        System.out.println("Hello");
//    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p : people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }
}
