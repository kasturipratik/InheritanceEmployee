package com.company;

public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee() {
      super();
    }

    public FullTimeEmployee(String name, String address, double salary, int bonus) {
        super(name, address );

        this.salary =bonus + salary;
    }

    public FullTimeEmployee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "\nFullTimeEmployee " +
                 super.toString() +
                ", salary= " + salary +" "+
                '}'+"\n";
    }
}