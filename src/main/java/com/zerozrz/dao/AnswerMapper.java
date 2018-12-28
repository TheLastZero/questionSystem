package com.zerozrz.dao;

import com.zerozrz.bean.Answer;
import java.util.List;

public interface AnswerMapper {
    int deleteByPrimaryKey(Integer answerId);

    int insert(Answer record);

    Answer selectByPrimaryKey(Integer answerId);

    List<Answer> selectAll();

    int updateByPrimaryKey(Answer record);
}