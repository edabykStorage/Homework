package main.BilgeAdam;

public class Engineer extends Employee {

    public Engineer(String name, String surname) {
        super(name, surname, 10000);
        setTitle("Stajyer");
    }

    public Engineer(String name, String surname, double salary) {
        super(name, surname, salary);
        if (getSalary() <= 10000) {
            setTitle("stajyer");
        } else if (getSalary() <= 17000 && getSalary() > 10000) {
            setTitle("kıdemli muhendis");
        } else setTitle("uzman muhendis");
    }

    @Override
    public void maasZammı(double ratio) {
        double increase = getSalary() * ratio / 100;
        setSalary(increase + getSalary() + 250);
        if (getSalary() <= 10000) {
            setTitle("stajyer");
        } else if (getSalary() <= 17000 && getSalary() > 10000) {
            setTitle("kıdemli muhendis");
        } else setTitle("uzman muhendis");
    }
}

