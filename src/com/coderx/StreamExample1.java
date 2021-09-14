package com.coderx;

import java.util.Arrays;
import java.util.List;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Shenal", "Fernando",22),
                new Person("Pamudu","Prabathiya",22),
                new Person("Tharindu", "Dilshan",22),
                new Person("Pasan", "Jayasinghe", 22),
                new Person("Vajith", "Chamuditha",21),
                new Person("Ruchira", "Nishan",21)
        );

        /* stream */
        people.stream()
                .filter(p -> p.getFirstName().startsWith("P"))
                .forEach(p -> System.out.println(p.getFirstName()));
    }
}
