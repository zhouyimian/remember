package com.km.remember.service;

import com.km.remember.domain.ClassInfo;

import java.util.List;

public interface ClassService {

    public ClassInfo getClassInfo(String classId);

    public List<ClassInfo> getAllClassInfo();
}
