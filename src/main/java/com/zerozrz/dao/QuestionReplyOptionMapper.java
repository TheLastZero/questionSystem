package com.zerozrz.dao;

import com.zerozrz.bean.QuestionReplyOption;
import java.util.List;

public interface QuestionReplyOptionMapper {
    int deleteByPrimaryKey(Integer qroId);

    int insert(QuestionReplyOption record);

    QuestionReplyOption selectByPrimaryKey(Integer qroId);

    List<QuestionReplyOption> selectAll();

    int updateByPrimaryKey(QuestionReplyOption record);
}