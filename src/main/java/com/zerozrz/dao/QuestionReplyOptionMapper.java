package com.zerozrz.dao;

import com.zerozrz.bean.QuestionReplyOption;
import com.zerozrz.bean.QuestionReplyOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionReplyOptionMapper {
    long countByExample(QuestionReplyOptionExample example);

    int deleteByExample(QuestionReplyOptionExample example);

    int deleteByPrimaryKey(Integer qroId);

    int insert(QuestionReplyOption record);

    int insertSelective(QuestionReplyOption record);

    List<QuestionReplyOption> selectByExample(QuestionReplyOptionExample example);

    QuestionReplyOption selectByPrimaryKey(Integer qroId);

    int updateByExampleSelective(@Param("record") QuestionReplyOption record, @Param("example") QuestionReplyOptionExample example);

    int updateByExample(@Param("record") QuestionReplyOption record, @Param("example") QuestionReplyOptionExample example);

    int updateByPrimaryKeySelective(QuestionReplyOption record);

    int updateByPrimaryKey(QuestionReplyOption record);
}