package com.zerozrz.dao;

import com.zerozrz.bean.UserAuths;
import java.util.List;

public interface UserAuthsMapper {
    int deleteByPrimaryKey(Integer authId);

    int insert(UserAuths record);

    UserAuths selectByPrimaryKey(Integer authId);

    List<UserAuths> selectAll();

    int updateByPrimaryKey(UserAuths record);
}