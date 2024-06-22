package com.abc.salary;

public interface SalariedIndividual {

    int getCommercialsPerDay();

   int getDaysWorkedInMonth();


    default double calculate(){

        int noOfDaysWorked = this.getDaysWorkedInMonth();
        int costPerDay= this.getCommercialsPerDay();

        int totalCost = noOfDaysWorked* costPerDay;
        int totalCostAfterPt = totalCost - 200;
        double tds = 0.1 * totalCostAfterPt;

        return totalCostAfterPt -tds;



    }
}
