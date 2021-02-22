package Q_100_111;

public class Q_108 {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();
        Employee director = new Director();
        // n1line

//        director.stockOptions = 1_000;
        employee.salary = 50_000;
//        manager.budget = 1_000_000;
//        manager.stockOption = 500;
//        employee.budget = 200_000;
        director.salary = 80_000;
        // Employee type can see salary only
    }
}
    class Employee {
        public int salary;
    }
    class Manager extends Employee{
        public int budget;
    }
    class Director extends Manager{
        public int stockOptions;
    }

    // And given the test method:
    /*
    Which two options compile when placed at line n1 of the main method? (Choose two.)
    A.	director.stockOptions = 1_000;
    B.	employee.salary = 50_000;
    C.	manager.budget = 1_000_000;
    D.	manager.stockOption = 500;
    E.	employee.budget = 200_000;
    F.	director.salary = 80_000;
    Answer: BF
     */
