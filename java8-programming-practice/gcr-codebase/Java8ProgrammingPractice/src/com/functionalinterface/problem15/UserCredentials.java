package com.functionalinterface.problem15;

public class UserCredentials implements SensitiveData {
	 private String username;
	 private String password;

	 public UserCredentials(String u, String p) {
	     username = u;
	     password = p;
	 }
	}

