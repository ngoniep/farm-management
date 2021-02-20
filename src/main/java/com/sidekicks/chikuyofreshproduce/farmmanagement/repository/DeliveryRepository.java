package com.sidekicks.chikuyofreshproduce.farmmanagement.repository;


import com.sidekicks.chikuyofreshproduce.farmmanagement.Model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@EnableJpaAuditing
public interface DeliveryRepository extends JpaRepository<Delivery,Integer> {
}
