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

        ExpenseManager manager = new ExpenseManager();
        manager.addExpense(expense);
        System.out.println( expense );

        Expense foundExpense = manager.findExpense(1);

        if (foundExpense != null) {
        System.out.println(foundExpense);
        } else {
        System.out.println("Expense not found.");
        }



        System.out.println("Total expenses: £" + manager.calculateTotal());

    }


}
