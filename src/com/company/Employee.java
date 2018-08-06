package com.company;

abstract public class Employee {

    protected int id;
    protected String name;
    protected String address;

    static int count =100;

    public Employee() {
        super();
    }

    public Employee(String name, String address) {

        this.name = name;
        this.id = count++;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    abstract public double salaryCalc();

    public void showDetails() {
        System.out.print("{ ");
        System.out.print("ID: " + id +", ");
        System.out.print("Name: " + name +", ");
        System.out.print("Address: " + address +", ");
        System.out.print("Salary: " + salaryCalc()+" }\n");
    }
}
