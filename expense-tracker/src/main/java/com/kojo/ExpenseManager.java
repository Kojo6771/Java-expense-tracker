package com.kojo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {
    //Expenses array list field
    private final List<Expense> expenses;
    

    //Constructor of the ExpenseManager
    public ExpenseManager(){
        expenses = new ArrayList<Expense>();


    }

    //Adds an expense to the list
    public void addExpense(Expense expense){
        if(expense != null){
            expenses.add(expense);
        } else { throw new IllegalArgumentException("Expense cannot be null");

        }
            
    }


    //Returns a copy of the expenses list
    public List<Expense> getAllExpenses(){
        return List.copyOf(expenses);
    }


    //Finds an expense by its ID
    public Expense findExpense(int id){
        for(Expense expense : expenses){
            if(expense.getID() == id){
                return expense;
            }
        }
        return null;
    }

    //Method to calculate the total expenses
    public BigDecimal calculateTotal(){
        BigDecimal total = BigDecimal.ZERO;

        //for loop to go through each indivial expense
        for(Expense expense: expenses){
            total = total.add(expense.getAmount());
        }
        
        return total;
        
    }




}


