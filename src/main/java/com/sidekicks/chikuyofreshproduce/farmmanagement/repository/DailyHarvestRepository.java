package com.sidekicks.chikuyofreshproduce.farmmanagement.repository;

import com.sidekicks.chikuyofreshproduce.farmmanagement.Model.DailyHarvest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface DailyHarvestRepository extends JpaRepository<DailyHarvest,Integer> {
}
