package com.company;

public class PartTimeEmployee extends Employee {

    private double salary;

    public PartTimeEmployee() {
        super();
    }

    public PartTimeEmployee(String name, String address, int workHrs){
        super(name, address);
        this.salary = salaryCalc(workHrs);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double salaryCalc(int workHrs){
        return workHrs * 100;
    }

    @Override
    public String toString() {
        return "\nPartTimeEmployee " +
                super.toString()+
                ", salary= " + salary +" "+
                '}'+" \n";
    }
}
