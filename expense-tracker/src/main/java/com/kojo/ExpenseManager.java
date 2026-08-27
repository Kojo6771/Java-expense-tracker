package com.kojo;

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
        }
            
    }


    //Returns a copy of the expenses list
    public List<Expense> getAllExpenses(){
        return List.copyOf(expenses);
    }



}


