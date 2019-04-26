package com.km.remember.serviceImpl;

import com.km.remember.dao.ActivityRecodeDao;
import com.km.remember.dao.ClassDao;
import com.km.remember.domain.ActivityRecode;
import com.km.remember.domain.ClassInfo;
import com.km.remember.service.ActivityRecodeService;
import com.km.remember.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityRecodeServiceImpl implements ActivityRecodeService {

    @Autowired
    private ActivityRecodeDao activityRecodeDao;

    @Override
    public List<ActivityRecode> getAllClassesActivityRecodes() {
        return activityRecodeDao.getAllClassesActivityRecodes();
    }
    @Override
    public List<ActivityRecode> getClassesActivityRecodes(String classId){
        return activityRecodeDao.getClassesActivityRecodes(classId);
    }

    @Override
    public ActivityRecode getActivityRecodeById(String activityId) {
        return activityRecodeDao.getActivityRecodeById(activityId);
    }
}
