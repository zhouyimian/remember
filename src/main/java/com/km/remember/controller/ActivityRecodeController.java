package com.km.remember.controller;

import com.km.remember.domain.ActivityRecode;
import com.km.remember.domain.ClassInfo;
import com.km.remember.service.ActivityRecodeService;
import com.km.remember.service.ClassService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@Controller
@RequestMapping("/Activity")
@CrossOrigin
public class ActivityRecodeController {

    @Autowired
    ActivityRecodeService activityRecodeService;

    @ResponseBody
    @GetMapping(value = "/")
    @ApiOperation(value="", notes="获取所有班级的活动信息")
    public List<ActivityRecode> getAllClassesActivityRecodes(){
        return activityRecodeService.getAllClassesActivityRecodes();
    }

    @ResponseBody
    @GetMapping(value = "/class/{classId}/")
    @ApiOperation(value="传入班级编号，查询班级所有活动记录信息", notes="当数据库成功查询到记录后，返回所有记录，否则返回null")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path", name = "classId", value = "班级编号", required = true, dataType = "String"),
    })
    public List<ActivityRecode> getClassesActivityRecodes(@PathVariable String classId){
        return activityRecodeService.getClassesActivityRecodes(classId);
    }


    @ResponseBody
    @GetMapping(value = "/{activityId}/")
    @ApiOperation(value="传入班级编号，查询班级所有活动记录信息", notes="当数据库成功查询到记录后，返回所有记录，否则返回null")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType="path", name = "activityId", value = "活动ID", required = true, dataType = "String"),
    })
    public ActivityRecode getActivityRecodeById(@PathVariable String activityId){
        return activityRecodeService.getActivityRecodeById(activityId);
    }
}
