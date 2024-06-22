package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;

public class Professor extends CollegeUser implements SalariedIndividual {

    private int noOfDaysWorked;
    private int costPerDay;




    public static int count;

    private String[] subject;

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public Professor(String name, char gender, String[] subject, int noOfDaysWorked, int costPerDay) {
        super(name, gender);
        Professor.count++;
        this.subject = subject;
        this.noOfDaysWorked = noOfDaysWorked;
        this.costPerDay= costPerDay;
    }

    public int getNoOfDaysWorked() {
        return noOfDaysWorked;
    }

    public void setNoOfDaysWorked(int noOfDaysWorked) {
        this.noOfDaysWorked = noOfDaysWorked;
    }

    public int getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }

    @Override
    public int getCommercialsPerDay() {
        return 0;
    }

    @Override
    public int getDaysWorkedInMonth() {
        return 0;
    }



   /* public Professor(){
        super();
    } /


    */
}
