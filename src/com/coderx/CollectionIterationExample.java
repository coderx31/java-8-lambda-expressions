package com.coderx;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Shenal", "Fernando",22),
                new Person("Pamudu","Prabathiya",22),
                new Person("Tharindu", "Dilshan",22),
                new Person("Pasan", "Jayasinghe", 22),
                new Person("Vajith", "Chamuditha",21),
                new Person("Ruchira", "Nishan",21)
        );

        /* external iteration */
//        for(Person p : people){
//            System.out.println(p);
//        }

//        for(int i=0; i<people.size(); i++){
//            System.out.println(people.get(i));
//        }

        // using forEach
        /* internal iteration */
        //people.forEach(person -> System.out.println(person));
        people.forEach(System.out::println); // using method reference

    }
}
