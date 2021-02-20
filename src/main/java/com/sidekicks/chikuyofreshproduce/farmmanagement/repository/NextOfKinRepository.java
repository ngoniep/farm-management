package com.sidekicks.chikuyofreshproduce.farmmanagement.repository;

import com.sidekicks.chikuyofreshproduce.farmmanagement.Model.NextOfKin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableJpaAuditing
public interface NextOfKinRepository extends JpaRepository<NextOfKin,Integer> {
}
