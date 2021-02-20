package com.sidekicks.chikuyofreshproduce.farmmanagement.service;


import com.sidekicks.chikuyofreshproduce.farmmanagement.Model.Activity;
import com.sidekicks.chikuyofreshproduce.farmmanagement.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {
    @Autowired
    ActivityRepository activityRepository;

    public Activity addNewActivity(Activity activity){
        return activityRepository.save(activity);
    }

    public List<Activity> getAllActivities(){
        return activityRepository.findAll();
    }

    public List<Activity> saveActivities(List<Activity>  activities){
        return activityRepository.saveAll(activities);
    }
    public Activity getActivity(String activityName){
        return activityRepository.findActivitiesByActivityName(activityName);

    }


}
