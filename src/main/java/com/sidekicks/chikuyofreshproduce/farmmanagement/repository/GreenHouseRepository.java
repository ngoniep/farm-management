package com.sidekicks.chikuyofreshproduce.farmmanagement.repository;

import com.sidekicks.chikuyofreshproduce.farmmanagement.Model.Greenhouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface GreenHouseRepository extends JpaRepository<Greenhouse,Integer> {
}
