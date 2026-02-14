package com.jdbc.JdbcDemo.advancefeatures;

import java.sql.*;

public class BankingSystem {

    // Check Balance
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
        else {

            System.out.println("Account not found");
        }
    }

    // Transfer Money (Transaction)
    public static void transferMoney(
        int from, int to, double amount)
        throws Exception {

        Connection con = DBConnection.getConnection();

        try {

            con.setAutoCommit(false);

            // withdraw
            PreparedStatement ps1 =
                con.prepareStatement(
                    "UPDATE account SET balance = balance - ? WHERE id=?");

            ps1.setDouble(1, amount);
            ps1.setInt(2, from);

            ps1.executeUpdate();

            // deposit
            PreparedStatement ps2 =
                con.prepareStatement(
                    "UPDATE account SET balance = balance + ? WHERE id=?");

            ps2.setDouble(1, amount);
            ps2.setInt(2, to);

            ps2.executeUpdate();

            // history
            PreparedStatement ps3 =
                con.prepareStatement(
                    "INSERT INTO transaction_history(from_account,to_account,amount) VALUES(?,?,?)");

            ps3.setInt(1, from);
            ps3.setInt(2, to);
            ps3.setDouble(3, amount);

            ps3.executeUpdate();

            con.commit();

            System.out.println("Transfer successful");

        }
        catch(Exception e) {

            con.rollback();

            System.out.println("Transfer failed");
        }
    }

    // Transaction History
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
