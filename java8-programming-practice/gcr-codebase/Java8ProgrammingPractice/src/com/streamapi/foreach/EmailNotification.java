package com.streamapi.foreach;

import java.util.List;

public class EmailNotification {
  public static void sendEmailNotification(String email) {
      System.out.println("Sent email to: " + email);
  }

  public static void main(String[] args) {
      List<String> emails = List.of("alice@example.com", "bob@example.com");

      emails.forEach(email -> sendEmailNotification(email));
  }
}

