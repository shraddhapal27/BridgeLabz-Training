package com.jdbc.JdbcDemo.transactionmanagement;


import java.sql.*;

public class BankingSystem {

    // Check balance
    public static void checkBalance(int id) throws Exception {

        Connection con = DBConnection.getConnection();

        String query =
            "SELECT balance FROM account WHERE id=?";

        PreparedStatement ps =
            con.prepareStatement(query);

        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if(rs.next()) {

            System.out.println(
                "Balance: " + rs.getDouble("balance"));
        }
    }

    // Transfer money using transaction
    public static void transferMoney(
            int from, int to, double amount)
            throws Exception {

        Connection con = DBConnection.getConnection();

        try {

            con.setAutoCommit(false);

            // withdraw
            PreparedStatement withdraw =
                con.prepareStatement(
                    "UPDATE account SET balance = balance - ? WHERE id=?");

            withdraw.setDouble(1, amount);
            withdraw.setInt(2, from);

            withdraw.executeUpdate();

            // deposit
            PreparedStatement deposit =
                con.prepareStatement(
                    "UPDATE account SET balance = balance + ? WHERE id=?");

            deposit.setDouble(1, amount);
            deposit.setInt(2, to);

            deposit.executeUpdate();

            // insert history
            PreparedStatement history =
                con.prepareStatement(
                    "INSERT INTO transaction_history(from_account,to_account,amount) VALUES(?,?,?)");

            history.setInt(1, from);
            history.setInt(2, to);
            history.setDouble(3, amount);

            history.executeUpdate();

            con.commit();

            System.out.println("Transfer successful");

        } catch(Exception e) {

            con.rollback();

            System.out.println("Transfer failed");
        }
    }

    // View transaction history
    public static void showHistory() throws Exception {

        Connection con = DBConnection.getConnection();

        Statement st = con.createStatement();

        ResultSet rs =
            st.executeQuery(
                "SELECT * FROM transaction_history");

        while(rs.next()) {

            System.out.println(
                "From: " + rs.getInt("from_account") +
                " To: " + rs.getInt("to_account") +
                " Amount: " + rs.getDouble("amount") +
                " Date: " + rs.getTimestamp("date")
            );
        }
    }
}

