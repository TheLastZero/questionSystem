package com.zerozrz.dao;

import com.zerozrz.bean.Reply;
import java.util.List;

public interface ReplyMapper {
    int deleteByPrimaryKey(Integer replyId);

    int insert(Reply record);

    Reply selectByPrimaryKey(Integer replyId);

    List<Reply> selectAll();

    int updateByPrimaryKey(Reply record);
}