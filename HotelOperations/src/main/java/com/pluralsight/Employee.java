package com.pluralsight;
import java.util.Scanner;

public class Employee {
    Scanner Scanner = new Scanner(System.in);

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;

    public Employee(int employeeID, String name, String department,double payRate, float hoursWorked){
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        return getRegulaPay() + getOvertimePay();
    }

    public double getRegulaPay(){
        return getRegularHours() * payRate;
    }

    public double getOvertimePay(){
        return getOvertimeHours() * payRate * 1.5;
    }

    public float getRegularHours(){
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public float getOvertimeHours() {
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    public void punchIn(double time){
        System.out.println(time);
    }

    public void punchOut(double time){
        time = punchIn() - punchOut(time);
        System.out.println(time);
    }


}
