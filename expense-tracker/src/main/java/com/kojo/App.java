package com.kojo;


import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Expense object
        Expense expense = new Expense(
            1,
            "Car finance",
            new BigDecimal("359.00"),
            LocalDate.of(2026, 7, 1),
            ExpenseCategory.BILLS
);
            System.out.println( expense );
    }
}
