package Prob1;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeMap<Employee, Double> obj = new TreeMap<Employee, Double>();
        obj.put(new Employee(10, "Ganesh", "Mumbai"), 14000.00);
        obj.put(new Employee(8, "Rajesh", "Mumbai"), 12000.00);
        obj.put(new Employee(9, "Suresh", "Mumbai"), 14500.00);
        obj.put(new Employee(5, "Mahesh", "Mumbai"), 12900.00);
        obj.put(new Employee(11, "Danesh", "Mumbai"), 22000.00);

        Set<Map.Entry<Employee,Double>> set= obj.entrySet();
        for(Map.Entry<Employee,Double> value: set) {

            Employee emp = value.getKey();
            System.out.println("Roll :" +emp.getEmpId());
            System.out.println("Name :" + emp.getName());
            System.out.println("Marks :" + emp.getAddress());
            System.out.println("Salary :" + value.getValue());
            System.out.println("*********************************");
        }
    }
}
