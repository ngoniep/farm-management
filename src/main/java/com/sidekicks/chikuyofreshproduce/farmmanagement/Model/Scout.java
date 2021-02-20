package com.sidekicks.chikuyofreshproduce.farmmanagement.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="scout",schema="farmmanager")
public class Scout {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    Integer id;
    Timestamp timeOfScout;
    String findings;

    @OneToOne
    Lot lot;

    @OneToMany
    List<Activity> resultantActivities;

    @OneToMany
    List<Worker> scouter;

    @OneToOne
    Worker supervisor;

    String supervisorComments;
}
