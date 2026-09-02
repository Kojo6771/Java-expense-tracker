package com.kojo;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ExpenseManager manager = new ExpenseManager();
        Scanner scanner = new Scanner(System.in);

        // Get user input for expense
        System.out.print("Enter expense name: ");
        String name = scanner.nextLine();

        System.out.print("Enter amount (e.g., 359.00): ");
        BigDecimal amount = new BigDecimal(scanner.nextLine());

        System.out.print("Enter date (YYYY-MM-DD): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter category (BILLS, FOOD, TRANSPORT, ENTERTAINMENT, OTHER): ");
        ExpenseCategory category = ExpenseCategory.valueOf(scanner.nextLine().toUpperCase());

        // Create and add expense (ID will be auto-assigned)
        Expense expense = new Expense(0, name, amount, date, category);
        manager.addExpense(expense);
        System.out.println("\nExpense added: " + expense);

        // Find and display the expense
        Expense foundExpense = manager.findExpense(expense.getID());
        if (foundExpense != null) {
            System.out.println("Found expense: " + foundExpense);
        } else {
            System.out.println("Expense not found.");
        }

        System.out.println("\nTotal expenses: £" + manager.calculateTotal());

        scanner.close();
    }


}
