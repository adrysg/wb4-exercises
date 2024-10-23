package com.pluralsight;
import java.util.Scanner;

public class Employee {
    Scanner Scanner = new Scanner(System.in);

    private int employeeID;
    private String name;
    private String department;
    private double payRate;
    private float hoursWorked;
    private double punchInTime;
    private double punchOutTime;

    public Employee(int employeeID, String name, String department, double payRate, float hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        return getRegulaPay() + getOvertimePay();
    }

    public double getRegulaPay() {
        return getRegularHours() * payRate;
    }

    public double getOvertimePay() {
        return getOvertimeHours() * payRate * 1.5;
    }

    public float getRegularHours() {
        return (hoursWorked > 40) ? 40 : hoursWorked;
    }

    public float getOvertimeHours() {
        return (hoursWorked > 40) ? hoursWorked - 40 : 0;
    }

    public double punchIn(double time) {
        punchInTime = time;
        return punchInTime;
    }

    public double punchOut(double time) {
        punchOutTime = time;
        hoursWorked = (float) (punchOutTime - punchInTime);
        return punchOutTime + hoursWorked;
    }

}
