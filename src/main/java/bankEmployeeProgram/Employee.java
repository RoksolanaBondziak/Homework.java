package bankEmployeeProgram;

import java.sql.SQLOutput;

public abstract class Employee {

    String name;
    int id;
    String title;
    String dateOfBirth;
    double salary;
    String address;

    public Employee(String name, int id, String title, String dateOfBirth, double salary, String address) {
        this.name = name;
        this.id = id;
        this.title = title;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {

        System.out.println("Name: " + name + ", ID: " + id + ", Title: " + title + ", Date of Birth " + dateOfBirth + ", Address " + address);
        return null;
    }

    public void createReport() {
        System.out.println("\n");
        System.out.println("_________________");
    }

    public void receiveSalary() {
        System.out.println(name + " will receive " + salary + " in the end of the month.");
    }


}
