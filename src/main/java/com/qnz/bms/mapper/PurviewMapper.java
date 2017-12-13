package com.qnz.bms.mapper;

import com.qnz.bms.domain.Purview;
import com.qnz.bms.domain.PurviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurviewMapper {
    long countByExample(PurviewExample example);

    int deleteByExample(PurviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Purview record);

    int insertSelective(Purview record);

    List<Purview> selectByExample(PurviewExample example);

    Purview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Purview record, @Param("example") PurviewExample example);

    int updateByExample(@Param("record") Purview record, @Param("example") PurviewExample example);

    int updateByPrimaryKeySelective(Purview record);

    int updateByPrimaryKey(Purview record);

    List<Purview> selectByRoleId(@Param("roleId") int roleId);
}