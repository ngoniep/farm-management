package com.sidekicks.chikuyofreshproduce.farmmanagement.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="activity",schema="farmmanager")
public class Activity {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    int id;
    String activityName;
    String activityDescription;
    Date targetDate;
    Date actualDate;
    String status;//DONE,WIP,
    String assignedTo;
    String activityType;

//    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=205, allocationSize=12)
//    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
//    public int getId(){
//        return id;
//    }



}
