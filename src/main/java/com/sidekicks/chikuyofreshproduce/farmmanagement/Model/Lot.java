package com.sidekicks.chikuyofreshproduce.farmmanagement.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="lot",schema="farmmanager")
public class Lot {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    Integer id;
    String lotName;
    String plantingDate;
    Date expectedMaturityDate;
    Date expectedFinalHarvestDay;
    Integer numberOfPlants;
    Double totalExpectedHarvest;
    Double totalHarvestToDate;
    String stage;
    String initialPercentageGermination;

    @OneToOne
    Greenhouse greenhouse;

    @OneToOne
    Product product;
}
