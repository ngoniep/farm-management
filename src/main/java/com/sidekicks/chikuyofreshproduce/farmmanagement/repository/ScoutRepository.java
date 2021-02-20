package com.sidekicks.chikuyofreshproduce.farmmanagement.repository;

import com.sidekicks.chikuyofreshproduce.farmmanagement.Model.Scout;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface ScoutRepository extends JpaRepository<Scout,Integer> {
}
