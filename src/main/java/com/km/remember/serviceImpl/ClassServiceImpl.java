package com.km.remember.serviceImpl;

import com.km.remember.dao.ClassDao;
import com.km.remember.domain.ClassInfo;
import com.km.remember.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassDao classDao;

    @Override
    public ClassInfo getClassInfo(String classId){
        return classDao.getClassInfo(classId);
    }

    @Override
    public List<ClassInfo> getAllClassInfo() {
        return classDao.getAllClassInfo();
    }
}
