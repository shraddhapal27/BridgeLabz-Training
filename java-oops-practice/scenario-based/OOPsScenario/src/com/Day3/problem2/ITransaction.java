package com.Day3.problem2;

interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    void checkBalance();
}
