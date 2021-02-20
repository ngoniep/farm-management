package com.sidekicks.chikuyofreshproduce.farmmanagement.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private int id;
    private String name;
    private String designation;
    private Double salary;
    private String doj;
    private String selfieUrl;
    private String maritalStatus;
    private String gender;
    private String dateOfBirth;
    private String fcbScore;
    private String sanctionsScreeningScore;
    private String accountNumber;
    private String livenessScore;
    private String faceMatchScore;
    private String phoneNumber;
    private String emailAddress;
    private String residentialAddress;
    private String idNumber;
    private String firstName;
    private String lastName;
    private String idVerified;
    private String creditRegistryScore;
    private String accountName;
    private String accountCurrency;
    private String accountApplicationDate;
    private String employerName;
    private String employmentStartDate;
    private String nextOfKinId;
    private String nextOfKinFullName;
    private String nextOfKinGender;
    private String relationship;
    private String nextOfKinContact;
    private String signatureUrl;

}
