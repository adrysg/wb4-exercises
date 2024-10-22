package com.pluralsight;

public class Employee {

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(int employeeID, String name, String department,double payRate, int hoursWorked){
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        double totalPay = 0;

        if (hoursWorked <= 40){
            totalPay = this.payRate * this.hoursWorked;
        }
        else if (hoursWorked > 40){
            double grossPay = this.hoursWorked * this.payRate;
            double otHours = this.hoursWorked - 40;
            double otPay = this.payRate * 1.5 * otHours;
            totalPay = grossPay + otPay;
        }
        return totalPay;
    }

    public int getRegularHours(){
        int regHours = 40;
        if (this.hoursWorked <= regHours){
            regHours = this.hoursWorked;
        }
        return regHours;
    }

    public int overtimeHours(){
        int otHours = 0;
        if (this.hoursWorked > 40){
            otHours = this.hoursWorked - 40;
        }
        return otHours;
    }

}
