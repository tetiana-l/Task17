package com.dz;

public class Employee {

    private String name;
    private String surname;
    private Double salary;

    public Employee(String name, String surname, double salary) throws TooSmallSalaryException, ImpossibleNameException {
        Validator validator = new Validator();
        validator.checkIfSalaryPositiveNumber(salary);
        validator.checkIfNameIsInCorrectFormat(name);
        validator.checkIfNameIsInCorrectFormat(surname);

        this.name = name;
        this.surname = surname;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                "}";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
