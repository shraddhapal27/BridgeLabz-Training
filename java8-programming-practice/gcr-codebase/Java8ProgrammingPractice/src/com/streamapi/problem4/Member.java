package com.streamapi.problem4;

import java.time.LocalDate;
public class Member {
    String name;
    LocalDate expiryDate;
    
 public Member(String name, LocalDate expiryDate) {
	 this.name = name;
	 this.expiryDate = expiryDate;
 }
 
 @Override
 public String toString() {
    return name + "'s membership expiring on " + expiryDate;
 }
}