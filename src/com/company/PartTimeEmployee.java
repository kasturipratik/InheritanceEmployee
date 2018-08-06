package com.company;

public class PartTimeEmployee extends Employee {

    private double salary;

    public PartTimeEmployee() {
        super();
    }

    public PartTimeEmployee(String name, String address, int workHrs){
        super(name, address);
        this.salary = salary(workHrs);
    }

    public double salary(int workHrs){

        return workHrs * 100;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\nPartTimeEmployee{" +
                ", id= " + id +
                ", name= '" + name + '\'' +
                ", address= '" + address + '\'' +
                ", salary= " + salary +
                '}'+"\n";
    }
}
