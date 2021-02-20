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
@Table(name="bed",schema="farmmanager")
public class Bed {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    Integer id;
    String bedCode;
    Double bedLength;
    Double bedWidth;
    String soilSample;

    @OneToMany
    List<BedLine> bedLines;

}
