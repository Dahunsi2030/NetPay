/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session_3;

/**
 *
 * @author USER
 */
public class NetPayClass {

    // INPUT MEMBER VARIABLES
    private String empTD;
    private String empName;
    private double hoursWorked;
    private double hourlyPayRate;
    private double fedTaxRate;
    private double stateTaxRate;

    // OUTPUT MEMBER VARIABLES
    private double grossPay;
    private double fedTaxAmount;
    private double stateTaxAmount;
    private double totalDeduction;
    private double netPay;

    // CONSTRUCTOR
    public NetPayClass(String empTD, String empName, double hoursWorked, double hourlyPayRate, double fedTaxRate, double stateTaxRate, double grossPay, double fedTaxAmount, double stateTaxAmount, double totalDeduction, double netPay) {
        this.empTD = empTD;
        this.empName = empName;
        this.hoursWorked = hoursWorked;
        this.hourlyPayRate = hourlyPayRate;
        this.fedTaxRate = fedTaxRate;
        this.stateTaxRate = stateTaxRate;
        this.grossPay = grossPay;
        this.fedTaxAmount = fedTaxAmount;
        this.stateTaxAmount = stateTaxAmount;
        this.totalDeduction = totalDeduction;
        this.netPay = netPay;
    }

    public NetPayClass(double hoursWorked, double hourlyPayRate, double fedTaxRate, double stateTaxRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyPayRate = hourlyPayRate;
        this.fedTaxRate = fedTaxRate;
        this.stateTaxRate = stateTaxRate;
    }
    
    

    // GETTERS
    public String getEmpTD() {
        return empTD;
    }

    public String getEmpName() {
        return empName;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public double getFedTaxRate() {
        return fedTaxRate;
    }

    public double getStateTaxRate() {
        return stateTaxRate;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFedTaxAmount() {
        return fedTaxAmount;
    }

    public double getStateTaxAmount() {
        return stateTaxAmount;
    }

    public double getTotalDeduction() {
        return totalDeduction;
    }

    public double getNetPay() {
        return netPay;
    }

    // SETTERS
    public void setEmpTD(String empTD) {
        this.empTD = empTD;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public void setFedTaxRate(double fedTaxRate) {
        this.fedTaxRate = fedTaxRate;
    }

    public void setStateTaxRate(double stateTaxRate) {
        this.stateTaxRate = stateTaxRate;
    }

    public void setGrossPay(double grossPay) {
        this.grossPay = grossPay;
    }

    public void setFedTaxAmount(double fedTaxAmount) {
        this.fedTaxAmount = fedTaxAmount;
    }

    public void setStateTaxAmount(double stateTaxAmount) {
        this.stateTaxAmount = stateTaxAmount;
    }

    public void setTotalDeduction(double totalDeduction) {
        this.totalDeduction = totalDeduction;
    }

    public void setNetPay(double netPay) {
        this.netPay = netPay;
    }

    // METHODS
    public double grossPay() {
        return getHoursWorked() * getHourlyPayRate();
    }

    public double fedTaxWithHolding() {
        return (getFedTaxRate() * grossPay()) / 100.0;
    }

    public double stateTaxWithHolding() {
        return (getStateTaxRate() * grossPay()) / 100.0;
    }

    public double totalDeduction() {
        return fedTaxWithHolding() + stateTaxWithHolding();
    }
    
    public double netPayAmount() {
        return grossPay() - totalDeduction();
    }

}
