package com.functionalinterface.problem15;

public class TestUser {
   public static void main(String[] args) {
	   UserCredentials user = new UserCredentials("alice", "pass123");
	   if (user instanceof SensitiveData) {
	       System.out.println("Encrypt this data before saving!");
	   }
   }
}
