package com.sidekicks.chikuyofreshproduce.farmmanagement.repository;

import com.sidekicks.chikuyofreshproduce.farmmanagement.Model.Lot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface LotRepository extends JpaRepository<Lot,Integer> {
}
