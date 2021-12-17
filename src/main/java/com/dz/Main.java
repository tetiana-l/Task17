package com.dz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static boolean exeStatus = false;

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();

        Employee employee1 = createEmployee("Alex", "Fox", -333);
        Employee employee2 = createEmployee("Аня", "Vil", 345);
        Employee employee3 = createEmployee("Dim", "Tim", 566);
        Employee employee4 = createEmployee(null, "Конев", 444);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);

        employeeList.removeAll(Collections.singleton(null));

        System.out.println("EMPLOYEE LIST: \n" + employeeList);
    }

    public static Employee createEmployee(String name, String surname, double salary) {
        Employee employee = null;
        exeStatus = false;
        try {
            employee = new Employee(name, surname, salary);
        } catch (ImpossibleNameException | NullPointerException ex) {
            exeStatus = true;
            System.out.println(ex.getMessage());
        } catch (TooSmallSalaryException ex) {
            System.out.println(ex.getMessage() + " " + ex.getSalary());
            exeStatus = true;
        }

        return employee;
    }
}
