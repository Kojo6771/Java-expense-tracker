package com.kojo;
import java.time.LocalDate;

public class Expense {
    private double amount;
    private LocalDate date;
    private String category;
    private String name;
    private int id;

    public Expense(double amount, LocalDate date, String category, String name, int id){
        this.amount = amount;
        this.date = date;
        this.category = category;
        this.name = name;
        this.id = id;

    }


    
}
