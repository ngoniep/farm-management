package com.sidekicks.chikuyofreshproduce.farmmanagement.repository;


import com.sidekicks.chikuyofreshproduce.farmmanagement.Model.Bed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface BedRepository extends JpaRepository<Bed,Integer> {
}
