package com.kots.practice.lambda;

/*
Lambda expressions are a concise way to represent anonymous functions, which can be used as method arguments or assigned to variables. They provide a way to write shorter and more readable code by reducing boilerplate code.
A lambda expression has the following syntax:
(parameters) -> expression
or
(parameters) -> { statements; }

 'parameters' represent the input parameters of the lambda expression.
 '->' is the lambda operator, which separates the parameters from the expression or statements.
 'expression' is a single expression that gets evaluated and returned.
 '{ statements; }' represents a block of statements to be executed.

Functional Interfaces
Lambda expressions are used in the context of functional interfaces. A functional interface is an interface that contains only one abstract method. They are used to represent the type of a lambda expression.

Using Lambda Expressions
Lambda expressions can be used in various contexts, such as passing them as arguments to methods, assigning them to variables, and using them in stream operations.

Lambda Expressions with Parameters
Lambda expressions can take one or more parameters. The types of the parameters can be explicitly declared or inferred by the compiler.

Method References
Method references provide a way to refer to a method by its name. They can be used as a shorthand for writing lambda expressions when the lambda expression simply calls an existing method.

Common Use Cases of Lambda Expressions
Lambda expressions are commonly used in functional programming, stream operations, event handling, and parallel programming.
 */

import com.kots.practice.lambda.util.Calculator;
import com.kots.practice.lambda.util.Greeting;

import java.util.Arrays;
import java.util.List;

public class GeneralInfo {
    /*
    Lambda expressions can be used in various aspects. Let's check them 1 by 1.
     */

//    Passing Lambda Expressions as Arguments
    public void calculator() {
        Calculator calc = new Calculator();
        int sum = calc.calculate(5, 10, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
    }
    /*
    In this example, we have an Operation functional interface with a single abstract method perform. The Calculator class has a calculate method that takes two integers and an Operation instance. We pass a lambda expression (a, b) -> a + b as the third argument to calculate the sum of two numbers.
     */



//    Assigning Lambda Expressions to Variables
    public void greeter() {
        Greeting greeting = () -> System.out.println("Hello World!");
        greeting.greet();
    }
    /*
    In this example, we have a Greeting functional interface with a single abstract method greet. We assign a lambda expression () -> System.out.println("Hello, world!") to the greeting variable and call the greet method on it.
     */


//    Stream Operations
    public void streamOp() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n * 2)
                .sum();
        System.out.println("Sum: " + sum);
    }
    /*
    In this example, we have a list of numbers. We use lambda expressions in stream operations such as filter and mapToInt to filter even numbers and double them. Finally, we calculate the sum of the resulting numbers.
     */

}
