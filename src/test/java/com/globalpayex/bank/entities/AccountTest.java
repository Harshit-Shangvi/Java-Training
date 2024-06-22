package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.LowBalException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testWithdrawDeposit() throws LowBalException {
        var account = new Account(1234,AccType.Savings,10000);

        //testing "methods"
        var actual = account.deposit(5000);
        assertEquals(15000,actual);

        var actual2 = account.withdraw(5000);
        assertEquals(10000,actual2);

        try{
            actual = account.withdraw(4000);
        }catch (LowBalException e){
            System.out.println(e.getMessage());
        }

        //null pointer check
        /*

        var details = account.getDetails();

        if (details!=null){
            System.out.println(account.getDetails().toUpperCase());

        }else{
            System.out.println("account not initialised");

        }

         */
        //instead of null ptr we use optional
        account
                .getDetails()
                .ifPresent(details-> System.out.println(details.toUpperCase()));






    }

    @Test
    void testEmptyAccount(){
        var account = new Account();
        assertEquals(0,account.getAccBalance());

        //System.out.println(account.getDetails().toUpperCase());...we cant do this since
        //null.toUpperCase ..so we introduce null ptr check

        //String details = account.getDetails();


        // null pointer check

        /*if (details!=null){
            System.out.println(account.getDetails().toUpperCase());
        }else{
            System.out.println("account not initialised");
        }
        */

        //we dont want null ptr check in our programs so we use optional
        /*account
                .getDetails()
                .ifPresent(details-> System.out.println(details.toUpperCase())); */

        account
                .getDetails()
                .ifPresentOrElse(
                        details-> System.out.println(details.toUpperCase()),
                        ()-> System.out.println("acc not initialised")

                );

    }
    @Test
    void testNegativeAmountWithdrawl(){
        var account = new Account(1234,AccType.Savings,10000);
        assertThrows(
                IllegalArgumentException.class,
                ()->account.withdraw(-1000)
        );
    }

    @Test
    void testWithdrawlMoreThanBalance(){
        var account = new Account(1234,AccType.Savings,1000);
        assertThrows(
                LowBalException.class,
                ()->account.withdraw(1000)
        );
    }

}