package com.coderx;

public class TypeInferenceExample {
    public static void main(String[] args) {

        StringLengthLambda myLambda = (String s) -> s.length();
        System.out.println(myLambda.getLength("Hello!"));

    }

    interface StringLengthLambda{
        int getLength(String s);
    }

}
