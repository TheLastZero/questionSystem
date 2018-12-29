package com.zerozrz.service;

import com.zerozrz.bean.Survey;
import com.zerozrz.bean.SurveyExample;
import com.zerozrz.dao.SurveyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService {

    @Autowired
    private SurveyMapper surveyMapper;

    public List<Survey> getPageListByStatus(Integer surveyStatus, String surveyName, Integer userId) {

        SurveyExample s = new SurveyExample();
        SurveyExample.Criteria c = s.createCriteria();
        c.andUserIdEqualTo(userId);//用户id必须作为查询条件

        if(!surveyName.equals("-1")){//不等于-1表示，此时问卷名字也需要作为查询条件
            c.andSurveyNameLike("%"+surveyName+"%");
        }

        if(surveyStatus==-1){//-1表示查询全部直接返回，但是唯独不包括删除状态的问卷
            c.andSurveyStatusNotEqualTo(3);
            return surveyMapper.selectByExample(s);
        }

        //有状态的话按照状态查询
        c.andSurveyStatusEqualTo(surveyStatus);
        return surveyMapper.selectByExample(s);
    }

}
