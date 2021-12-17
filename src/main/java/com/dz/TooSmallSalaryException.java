package com.dz;

public class TooSmallSalaryException extends Exception {

    private final double salary;

    public TooSmallSalaryException(String errorMessage, double salary) {
        super(errorMessage);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}
