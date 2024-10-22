package com.pluralsight;

public class Employee {

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
         if (hoursWorked > 40){
            double regPay = 40 * payRate;
            float otHours = hoursWorked - 40;
            double otPay = payRate * 1.5 * otHours;
            return regPay + otPay;
        }
         else {
             return this.payRate * this.hoursWorked;
         }
    }

    public float getRegularHours(){
//        float regHours = 40;
//        if (this.hoursWorked <= regHours){
//            regHours = this.hoursWorked;
//        }
        return 0;
    }

    public float overtimeHours(){
//        float otHours = 0;
//        if (this.hoursWorked > 40){
//            otHours = this.hoursWorked - 40;
//        }
        return 0;
    }

}
