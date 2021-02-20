package com.sidekicks.chikuyofreshproduce.farmmanagement.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="disease",schema="farmmanager")
public class Disease {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    Integer Id;
    String diseaseName;
    String sampleImages;
    String generalTreatmentPlan;
    String preventativePlan;
    String effects;
    String diseaseLevel;
    String diseaseSeverity;
    String actualImage;

}
