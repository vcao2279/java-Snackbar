package com.company;

public class Main {
    public static void main(String[] args)
    {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine foodVendingMachine = new VendingMachine("Food");
        VendingMachine drinkVendingMachine = new VendingMachine("Drink");
        VendingMachine officeVendingMachine = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36,1.75, foodVendingMachine.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36,1.00, foodVendingMachine.getId());
        Snack pretzel = new Snack("Pretzel", 30,2.00, foodVendingMachine.getId());
        Snack soda = new Snack("Soda", 24,2.50, drinkVendingMachine.getId());
        Snack water = new Snack("Water", 20,2.75, drinkVendingMachine.getId());

        System.out.println("**Jane buys 3 soda**");
        jane.buySnack(soda.sellSnack(3));

        System.out.println("**Jane buys 1 pretzel**");
        jane.buySnack(pretzel.sellSnack(1));

        System.out.println("**Jane buys 1 soda**");
        bob.buySnack(soda.sellSnack(2));
    }
}
