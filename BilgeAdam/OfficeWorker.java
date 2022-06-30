package main.BilgeAdam;

public class OfficeWorker extends Employee {


    public OfficeWorker(String name, String surname) {
        super(name, surname);
        setSalary(8000);
        setTitle("Stajyer");
    }

    public OfficeWorker(String name, String surname, double salary) {
        super(name, surname, salary);
        if (getSalary() <= 8000) {
            setTitle("stajyer");
        } else if (getSalary() <= 12000 && getSalary() > 8000) {
            setTitle("calisan");
        } else if (getSalary() <= 15000 && getSalary() > 12000)setTitle("kıdemli calisan");
    }
}
