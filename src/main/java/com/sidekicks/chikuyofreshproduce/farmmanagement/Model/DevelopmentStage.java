package com.sidekicks.chikuyofreshproduce.farmmanagement.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="developmentstage",schema="farmmanager")
public class DevelopmentStage {

    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    Integer id;
    String stageName;
    String characteristics;
    Integer stageStartDaysFromPlanting;
    Integer actualStartDaysFromPlanting;
    String stageImageUrl;

}
