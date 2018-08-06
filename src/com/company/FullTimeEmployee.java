package com.company;

public class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee() {
      super();
    }

    public FullTimeEmployee(String name, String address, double salary) {
        super(name, address);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "\nFullTimeEmployee{" +
                ", id= " + id +
                ", name= '" + name + '\'' +
                ", address= '" + address + '\'' +
                ", salary= " + salary +
                '}'+"\n";
    }
}
