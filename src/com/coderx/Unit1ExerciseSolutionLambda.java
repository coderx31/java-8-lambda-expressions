package com.coderx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseSolutionLambda {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Shenal","Fernando",22),
                new Person("Pamudu", "Prabathiya",22),
                new Person("Tharindu","Dilshan",22),
                new Person("Pasan","Jayasinghe",22),
                new Person("Vajith", "Chamuditha",21),
                new Person("Ruchira","Nishan",21)
        );

        // Step 1: sort the list by last name
        //with just one line, no need to implements the Person class
        people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
        System.out.println(people);
        System.out.println();

        // Step 2: create a method that prints all the elements in the list

        // Step 3: create a method that prints people beginning c in there last name
    }
}
