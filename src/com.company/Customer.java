package com.company;

public class Customer
{
    private static int maxId=0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash)
    {
        id = ++maxId;
        this.name=name;
        this.cash=cash;
    }

    public void addCash(double cash)
    {
        this.cash += cash;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public double getCash()
    {
        return cash;
    }

    public void buySnack(double cost)
    {
        this.cash -= cost;
    }

    @Override
    public String toString()
    {
        String rtnStr= "Customer's id: " + id + "\n" +
                "Customer's name: " + name + "\n" +
                "Customer's current amount of cash: " + cash + "\n";

        return rtnStr;
    }
}
