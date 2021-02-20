package com.sidekicks.chikuyofreshproduce.farmmanagement.service;



import com.sidekicks.chikuyofreshproduce.farmmanagement.Configs.MyConfigurations;
import com.sidekicks.chikuyofreshproduce.farmmanagement.Model.PersonalDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Component
public class PersonFeignService {


    @FeignClient(name="PROFILE-SERVICE", configuration = MyConfigurations.class,decode404 = true)
    public interface PersonServiceFeignClient {

        @RequestMapping(method = RequestMethod.POST, value = "/profile/post-personal-details")
        PersonalDetails addPerson(@RequestBody PersonalDetails personalDetails);

        @RequestMapping(method = RequestMethod.GET, value = "/profile/{idNumber}",produces  =  "application/json" ,consumes = "application/json")
        ResponseEntity<PersonalDetails> getPersonalDetailsByIdNumber(@PathVariable String idNumber);


        @RequestMapping(method = RequestMethod.GET, value = "/profile/user/{userName}")
        PersonalDetails getPersonalDetailsByUsername(@PathVariable String userName);

        @RequestMapping(method = RequestMethod.PUT, value = "/upgrade-kyc-lite")
        PersonalDetails updateKycLiteToFullKyc(@RequestBody PersonalDetails personalDetails);





       /* @RequestMapping(method = RequestMethod.POST, value = "/user/{userName}")
        PersonalDetails addUsername(String personId, String userName);*/
    }


}
