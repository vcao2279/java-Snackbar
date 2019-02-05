package com.company;

public class VendingMachine {
    private static int maxId = 0;
    private int id;
    private String name;

    public VendingMachine(String name)
    {
        id = ++maxId;
        this.name = name;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString()
    {
        String rtnStr= "Vending Machine's id: " + id + "\n" +
                       "Vending Machine's name: " + name + "\n";

        return rtnStr;
    }
}
