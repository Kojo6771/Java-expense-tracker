package com.kojo;
import java.time.LocalDate;
import java.math.BigDecimal;

public class Expense  {

    //Private fields
    private BigDecimal amount;
    private LocalDate date;
    private ExpenseCategory category;
    private String name;
    private int id;

    //constructor for expense object
    public Expense(int id, String name,BigDecimal amount, LocalDate date, ExpenseCategory category){
        //Making constuction match fields
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.name = name;
        this.id = id;

        //Preventing invalid values
        if (amount == null || amount.compareTo(BigDecimal.ZERO) < 0){
            throw new IllegalArgumentException("Amount cannot be negative or null");
        }

        if(name == null){
            throw new IllegalArgumentException("Name cannont be null"); 

        }
      
        if(category ==null){
            throw new IllegalArgumentException("Category cannot be null");
        }

        if(date == null){
            throw new IllegalArgumentException("Date cannot be null");
        }


    }


    //get methods
    public int getID(){
        return id;
    }

    public BigDecimal getAmount(){
        return amount;
    }

    public LocalDate getDate(){
        return date;
    }

    public ExpenseCategory getCategory(){
        return category;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        StringBuilder expense = new StringBuilder();
        expense.append("Expense{id=")
               .append(id)
               .append(", name='")
               .append(name)
               .append("', amount=")
               .append(amount)
               .append(", date=")
               .append(date)
               .append(", category=")
               .append(category)
               .append("}");
        return expense.toString();
    }
    
}
