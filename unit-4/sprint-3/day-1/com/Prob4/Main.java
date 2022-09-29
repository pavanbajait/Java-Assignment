package com.Prob4;

import com.Prob1.Student;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Address adr = new Address("Mah", "Hingan", "442301");
        Employee emp = new Employee(101, "Pavan", adr, "pbajait@gmail.com", "Pavan123");
        FileOutputStream fos= null;
        try {
            fos = new FileOutputStream("emp.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(emp);
            oos.flush();
            oos.close();
            System.out.println("Serialization done of Student Object");
            FileInputStream fis = new FileInputStream("emp.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            Employee employee = (Employee) obj;
            System.out.println(employee);
            ois.close();
            System.out.println("Deserilization done successfully");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
