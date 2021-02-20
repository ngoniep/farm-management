package com.sidekicks.chikuyofreshproduce.farmmanagement.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Map;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
//@Entity
//@Table(schema = "digital_onboarding",name = "personal_details")
public class PersonalDetails {

    @Id
    @GeneratedValue
    String id;
    String idNumber;
    String customerIdNumber;
    String userName;
    String firstName;
    String lastName;
    String dateOfBirth;
    String middleName;
    String gender;
    Boolean isFullKyc;
    boolean isLivePerson;
    String idImageBase64String;
    String selfieBase64String;
    String backOfIdImageBase64String;
    String proofOfResidenceBase64String;
    String signatureBase64String;
    String primaryPhoneNumber;
    private boolean isDeleted;
    private List<String> productConditions;
    Map<String, String> additionalDetails;


}
