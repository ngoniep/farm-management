package com.sidekicks.chikuyofreshproduce.farmmanagement;

import com.sidekicks.chikuyofreshproduce.farmmanagement.service.EmployeeService;
import com.sidekicks.chikuyofreshproduce.farmmanagement.service.PersonFeignService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class FarmManagementApplicationTests {

    @Autowired
    EmployeeService.DistributionClient employeeService;

    @Autowired
    PersonFeignService.PersonServiceFeignClient personServiceFeignClient;
    @Test
    void contextLoads() {

        employeeService.getAllEmployees();
    }

}
