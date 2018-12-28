package com.zerozrz.dao;

import com.zerozrz.bean.UserAuths;
import com.zerozrz.bean.UserAuthsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAuthsMapper {
    long countByExample(UserAuthsExample example);

    int deleteByExample(UserAuthsExample example);

    int deleteByPrimaryKey(Integer authId);

    int insert(UserAuths record);

    int insertSelective(UserAuths record);

    List<UserAuths> selectByExample(UserAuthsExample example);

    UserAuths selectByPrimaryKey(Integer authId);

    int updateByExampleSelective(@Param("record") UserAuths record, @Param("example") UserAuthsExample example);

    int updateByExample(@Param("record") UserAuths record, @Param("example") UserAuthsExample example);

    int updateByPrimaryKeySelective(UserAuths record);

    int updateByPrimaryKey(UserAuths record);
}