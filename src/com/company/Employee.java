package com.company;

public class Employee {

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

    public double salary(){
        return 0.0;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
