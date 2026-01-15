package com.Day9.problem2;

class AnnualBudget extends Budget {

    public AnnualBudget(double income, double limit,
                        String[] categories, double[] categoryLimits) {
        super(income, limit, categories, categoryLimits);
    }

    @Override
    public void generateReport() {
        System.out.println("📊 Annual Budget Report");
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + totalExpenses());
        System.out.println("Net Savings: " + netSavings());
    }

    @Override
    public void detectOverspend() {
        if (totalExpenses() > limit) {
            System.out.println(" Annual budget limit exceeded!");
        }
    }
}
