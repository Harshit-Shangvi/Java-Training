package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.LowBalException;

import java.util.Optional;

public class Account {

    private long accNo;
    private AccType accType;
    private double accBalance;

    public static final String ACCTYPE_SAVINGS = "Savings";
    public static final String ACCTYPE_CURRENT = "Current";

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public AccType getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        /*if(accType.equals(Account.ACCTYPE_SAVINGS)|| accType.equals(Account.ACCTYPE_CURRENT))
            this.accType = accType;

         */
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    //default cons
    public Account(){};

    //parametrised constructor
    public Account(long accNo, AccType accType, double accBalance) {
        this.accNo = accNo;
        this.accType = accType;
        this.accBalance = accBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", accType='" + accType + '\'' +
                ", accBalance=" + accBalance +
                '}';
    }

    //methods
    public double withdraw(double amount) throws LowBalException{
        System.out.println("Transaction Starts..");
        try {


            if (amount <= 0) {
                throw new IllegalArgumentException("Amount needs to be positive");

            } else if (this.accBalance - amount < 1000) {
                //throw new IllegalStateException("Withdraw amount more than balance");
                throw new LowBalException("Withdraw amount more than balance");

            }
            return this.accBalance -= amount;
        }
        finally {
            System.out.println("Transaction ends..");
        }

    }

    public double deposit(double amount){
        return this.accBalance+=amount;

    }
    /*
    we are ditching below since it can return null which
    leads to adding null ptr check in test

    public String getDetails(){

        if(this.accNo==0){
            return null;
        }

        return String.format(

                "AccountNumber: %s\nAccountType:%s\nAccountBalance:%s",
                this.accNo,
                this.accType,
                this.accBalance


        );


    }

     */

    //introducing optional so that we avoid return null
    public Optional<String> getDetails(){

        if(this.accNo==0){
            return Optional.empty();
        }else{
            return Optional.of(String.format(
                    "AccountNumber: %s\nAccountType:%s\nAccountBalance:%s",
                    this.accNo,
                    this.accType,
                    this.accBalance


            ));

        }




    }


}
