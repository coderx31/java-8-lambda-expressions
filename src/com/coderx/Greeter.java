package com.coderx;

public class Greeter {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();

        //greeter.greet(helloWorldGreeting);

        Greeting myLambdaExpression  = () -> System.out.println("Hello Wolrd!");

        //MyAdd sumFunction = (int a, int b) -> a + b;

        myLambdaExpression.perform();

       
    }

    public void greet(Greeting greeting){
       // System.out.println("Hello World!");
        greeting.perform();
    }


}

//interface MyLambda{
//    void foo();
//
//   // int sum(int a, int b);
//}
//
//interface MyAdd{
//    int sum(int a, int b);
//}
