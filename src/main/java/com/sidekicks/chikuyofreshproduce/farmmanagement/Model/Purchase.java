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
@Table(name="purchase",schema="farmmanager")
public class Purchase {
    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN", initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq-gen")
    Integer id;
    @OneToOne
    Supplier supplier;
    Double price;
    Date dateOfPurchase;
    String quotationUrl; //
    String recieptUrl; //Define rules of when reciepts may not be mandatory
}
