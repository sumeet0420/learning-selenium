package com.learning.day1;

import java.util.Map;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

public enum Operations {

    PLUS("+", (x,y)->x+y), MINUS("-", (x,y)->x-y), MULTIPLY("*", (x,y)->x*y);

    private final String symbol;
    private final DoubleBinaryOperator operation;

    Operations(String symbol, DoubleBinaryOperator operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    private static final Map<String, Operations> stringToEnum = Stream.of(values()).collect(toMap(Operations::symbol, identity()));

    private static String symbol(Operations operations) {
        return operations.symbol;
    }


    public static Optional<Operations> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }

    public double operate(double x, double y) {
        return operation.applyAsDouble(x, y);
    }

    @Override
    public String toString() {
        return "Operation : "+symbol;
    }

    public static void main(String[] args) {
        System.out.println(Operations.fromString("+"));
        System.out.println(Operations.PLUS.operate(10, 20));
    }
}
