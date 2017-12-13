package com.qnz.bms.mapper;

import com.qnz.bms.domain.UserRolePurview;
import com.qnz.bms.domain.UserRolePurviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRolePurviewMapper {
    long countByExample(UserRolePurviewExample example);

    int deleteByExample(UserRolePurviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRolePurview record);

    int insertSelective(UserRolePurview record);

    List<UserRolePurview> selectByExample(UserRolePurviewExample example);

    UserRolePurview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRolePurview record, @Param("example") UserRolePurviewExample example);

    int updateByExample(@Param("record") UserRolePurview record, @Param("example") UserRolePurviewExample example);

    int updateByPrimaryKeySelective(UserRolePurview record);

    int updateByPrimaryKey(UserRolePurview record);
}