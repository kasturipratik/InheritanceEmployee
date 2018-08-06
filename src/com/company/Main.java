package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
	// write your code here
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Pratap", "Baltimore", 40);
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Pratik","Baltimore",1000,500);
        PartTimeEmployee p1 = new PartTimeEmployee("Ujwal", "Nepal", 20);
        FullTimeEmployee f1 = new FullTimeEmployee("Kabin", "Nepal",2500,500);
        PartTimeEmployee p2 = new PartTimeEmployee("Punit", "Ohio", 30);
        PartTimeEmployee p3 = new PartTimeEmployee("Pratik", "India", 50);
        FullTimeEmployee f2 = new FullTimeEmployee("Diwakar", "Hongkong", 25000,500);


        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(fullTimeEmployee);
        employeesList.add(f1);
        employeesList.add(f2);

        employeesList.add(partTimeEmployee);
        employeesList.add(p1);
        employeesList.add(p2);
        employeesList.add(p3);

        /**
         * Sorting using comparator
         */
        Collections.sort(employeesList, new sorting());

        //System.out.println(employeesList);

        /**
         * Soring by name array list
         */
        Collections.sort(employeesList,new nameSorting());
        //System.out.println(employeesList);

        /**
         * finding only part time or full time employee using instanceof method
         */
        for(Employee a : employeesList){

            if(a instanceof PartTimeEmployee){
                System.out.println(a);
            }

        }

    }
}
/**
 * *comparing the objects in the employee list using id and sorting in descending order*
 */
class sorting implements Comparator<Employee>{
        public int compare(Employee a, Employee b){
            return b.id - a.id;
        }
}

/**
 * comparator for sorting by name
 */
class nameSorting implements Comparator<Employee>{
    public int compare(Employee a, Employee b){
        return a.name.compareTo(b.name);
    }
}

