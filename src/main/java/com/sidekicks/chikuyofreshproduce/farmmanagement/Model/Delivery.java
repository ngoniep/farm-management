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
@Table(name="delivery",schema="farmmanager")
public class Delivery {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    Integer id;
    Date deliveryDate;
    String description;
    // Delivery variance
    // Auto Generate Invoice
}
