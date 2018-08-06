package com.company;

public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee() {
      super();
    }

    public FullTimeEmployee(String name, String address, double salary) {
        super(name, address );
        this.salary = salary();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double salary(){
        salary =1000 + salary;
        return salary;
    }
}
