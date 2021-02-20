package com.sidekicks.chikuyofreshproduce.farmmanagement.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="worker",schema="farmmanager")
public class Worker {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    Integer id;
    String idNumber;
    String idDocumentUrl;
    String contractType;
    String contractUrl; //
    String name; //
    String surname; //
    String dateOfBirth;
    Date dateJoined;
    Date contractEndDate;
    String maritalStatus;
    String levelOfEducation;
    @OneToMany
    List<NextOfKin> nextOfKin; //
}
