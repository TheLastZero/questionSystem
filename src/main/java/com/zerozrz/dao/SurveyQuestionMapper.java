package com.zerozrz.dao;

import com.zerozrz.bean.SurveyQuestion;
import com.zerozrz.bean.SurveyQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SurveyQuestionMapper {
    long countByExample(SurveyQuestionExample example);

    int deleteByExample(SurveyQuestionExample example);

    int deleteByPrimaryKey(Integer questionId);

    int insert(SurveyQuestion record);

    int insertSelective(SurveyQuestion record);

    List<SurveyQuestion> selectByExample(SurveyQuestionExample example);

    SurveyQuestion selectByPrimaryKey(Integer questionId);

    int updateByExampleSelective(@Param("record") SurveyQuestion record, @Param("example") SurveyQuestionExample example);

    int updateByExample(@Param("record") SurveyQuestion record, @Param("example") SurveyQuestionExample example);

    int updateByPrimaryKeySelective(SurveyQuestion record);

    int updateByPrimaryKey(SurveyQuestion record);
}