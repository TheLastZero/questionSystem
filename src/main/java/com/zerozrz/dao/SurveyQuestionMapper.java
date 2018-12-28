package com.zerozrz.dao;

import com.zerozrz.bean.SurveyQuestion;
import java.util.List;

public interface SurveyQuestionMapper {
    int deleteByPrimaryKey(Integer questionId);

    int insert(SurveyQuestion record);

    SurveyQuestion selectByPrimaryKey(Integer questionId);

    List<SurveyQuestion> selectAll();

    int updateByPrimaryKey(SurveyQuestion record);
}