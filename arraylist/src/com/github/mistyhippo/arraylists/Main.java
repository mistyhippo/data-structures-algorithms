package com.github.mistyhippo.arraylists;

import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

//
//        //print out list of employees using Lambda
//        employeeList.forEach(employee -> System.out.println(employee));
//
//        //print out second employee in list
//        System.out.println(employeeList.get(1));
//
//        //check to see if list is empty
//        System.out.println(employeeList.isEmpty());
//
        //replace an employee with a new one
        employeeList.set(1,new Employee("John", "Adams", 4568));
       // employeeList.forEach(employee -> System.out.println(employee));

        //get number of items in list
     //   System.out.println(employeeList.size());

        //add employee to list at a different position
        employeeList.add(3, new Employee("John", "Doe", 4567));
        employeeList.forEach(employee -> System.out.println(employee));

        // getting employee list as an array
        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee: employeeArray){

            System.out.println(employee);
        }

        // check to see if employee exists in list
        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));

        //checks to see where employee exist in list
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));

        //remove an employee from list
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

    }
}
