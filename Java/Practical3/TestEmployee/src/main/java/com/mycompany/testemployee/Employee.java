
package com.mycompany.testemployee;

public class Employee {
    private String Name;
    private int Age;
    private double Salary;
    private double Bonus;

    public Employee(String name, int age, double salary, double bonus) {
        this.Name = name;
        this.Age = age;
        this.Salary = salary;
        this.Bonus = bonus;
    }

    // Getter and Setter methods for Name, Age, Salary
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    // Getter and Setter for Bonus
    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        this.Bonus = bonus;
    }

    // Method to calculate Bonus Amount
    public double calculateBonusAmount() {
        return Salary + Bonus;
    }
}

