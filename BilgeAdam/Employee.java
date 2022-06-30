package main.BilgeAdam;

import java.util.UUID;

public class Employee {
    private String name;
    private String surname;
    private String title;
    private double salary;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, double salary) {
        this(name, surname);
        this.salary = salary;
    }

    public void maasZammı(double ratio) {
        double increase = this.salary * ratio/100;
        this.salary = increase + salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}



