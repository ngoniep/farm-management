package com.sidekicks.chikuyofreshproduce.farmmanagement.service;

import com.sidekicks.chikuyofreshproduce.farmmanagement.Configs.MyConfigurations;
import com.sidekicks.chikuyofreshproduce.farmmanagement.Model.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Service
public class EmployeeService {
    //employee-service

    @FeignClient(value = "employee-service",configuration = MyConfigurations.class)
    public interface DistributionClient {

        @GetMapping(value = "/all-employees")
         List<Employee> getAllEmployees();
    }
}
