package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Pratik","Baltimore",1000);
        FullTimeEmployee f1 = new FullTimeEmployee("kabin", "Nepal",2500);
        FullTimeEmployee f2 = new FullTimeEmployee("Diwakar", "Hongkong", 25000);

        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(fullTimeEmployee);
        employeesList.add(f1);
        employeesList.add(f2);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Pratap", "Baltimore", 40);
        PartTimeEmployee p1 = new PartTimeEmployee("Ujwal", "Nepal", 20);
        PartTimeEmployee p2 = new PartTimeEmployee("Punit", "Ohio", 30);
        PartTimeEmployee p3 = new PartTimeEmployee("Pratik", "India", 50);

        employeesList.add(partTimeEmployee);
        employeesList.add(p1);
        employeesList.add(p2);
        employeesList.add(p3);

       // System.out.println(employeesList);

        System.out.println(p1.getAddress() +" "+ p1.getName()+" " + p1.getSalary());
    }
}
