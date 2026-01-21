package com.javacollections.insurancepolicymanagementsystem;
//Policy class

import java.util.Objects;

public class Policy implements Comparable<Policy> {

 int policyNo;
 String holderName;
 String expiryDate;   // yyyy-mm-dd
 String coverageType;
 double premium;

 public Policy(int policyNo, String holderName,
               String expiryDate, String coverageType,
               double premium) {
     this.policyNo = policyNo;
     this.holderName = holderName;
     this.expiryDate = expiryDate;
     this.coverageType = coverageType;
     this.premium = premium;
 }

 // Sort by expiry date for TreeSet
 public int compareTo(Policy p) {
     return this.expiryDate.compareTo(p.expiryDate);
 }

 // Duplicate check using policy number
 public boolean equals(Object o) {
     Policy p = (Policy) o;
     return this.policyNo == p.policyNo;
 }

 public int hashCode() {
     return Objects.hash(policyNo);
 }

 public String toString() {
     return policyNo + " " + holderName + " " +
            expiryDate + " " + coverageType +
            " " + premium;
 }
}
