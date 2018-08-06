package com.company;

public class PartTimeEmployee extends Employee {


    private int workhrs;

    public PartTimeEmployee() {
        super();
    }

    public PartTimeEmployee(String name, String address, int workHrs){
        super(name, address);
        this.workhrs = workHrs;
    }

    public double salaryCalc(){
        return  workhrs* 100;
    }


}
