package com.km.remember.service;

import com.km.remember.domain.ActivityRecode;

import java.util.List;

public interface ActivityRecodeService {

    public List<ActivityRecode> getAllClassesActivityRecodes();

    public List<ActivityRecode> getClassesActivityRecodes(String classId);

    public ActivityRecode getActivityRecodeById(String activityId);
}
