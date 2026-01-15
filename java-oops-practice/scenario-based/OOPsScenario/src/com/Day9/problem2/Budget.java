package com.Day9.problem2;

abstract class Budget implements IAnalyzable {

    protected double income;
    protected double limit;

    protected String[] categories;
    protected double[] categoryLimits;

    protected Transaction[] transactions;
    protected int count = 0;

    protected Budget(double income, double limit,
                     String[] categories, double[] categoryLimits) {
        this.income = income;
        this.limit = limit;
        this.categories = categories;
        this.categoryLimits = categoryLimits;
        this.transactions = new Transaction[20]; // fixed size
    }

    public void addTransaction(Transaction t) {
        transactions[count++] = t;
    }

    protected double totalExpenses() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            if (transactions[i].getType().equalsIgnoreCase("expense")) {
                total += transactions[i].getAmount();
            }
        }
        return total;
    }

    public double netSavings() {
        return income - totalExpenses();   // operator usage
    }
}
