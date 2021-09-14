package com.coderx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1Exercise {
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

        Collections.sort(people); // ascending order

       // Collections.sort(people,Collections.reverseOrder()); // descending order
        //Collections.sort(people);

        //System.out.println(people);
        //System.out.println("");
        // Step 2: create a method that prints all the elements in the list
        printAll(people);


        // Step 3: create a method that prints people beginning c in there last name
        printC(people);
        System.out.println();

    }
    /* these methods are only going to use in this class
        therefore these are private */
    private static void printAll(List<Person> people){
        for(Person person : people){
            System.out.println(person);
        }
    }

    private static void printC(List<Person> people){
        for(Person person : people){
            if(person.getLastName().startsWith("C")){
                System.out.println(person);
            }
        }
    }
}
