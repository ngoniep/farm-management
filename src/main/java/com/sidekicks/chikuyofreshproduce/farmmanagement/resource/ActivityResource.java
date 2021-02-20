package com.sidekicks.chikuyofreshproduce.farmmanagement.resource;


import com.sidekicks.chikuyofreshproduce.farmmanagement.Model.Activity;
import com.sidekicks.chikuyofreshproduce.farmmanagement.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/activities")
public class ActivityResource {

    @Autowired
    ActivityService activityService;

    @GetMapping("/all")
    public List<Activity> getAllActivities(){
        return activityService.getAllActivities();
    }
    @PostMapping("/add-all")
    public List<Activity> addActivities(@RequestBody List<Activity> activities){
        return activityService.saveActivities(activities);
    }

    @PostMapping("/add")
    public Activity addActivities(@RequestBody Activity activities){
        return activityService.addNewActivity(activities);
    }
}
