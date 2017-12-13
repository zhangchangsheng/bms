package com.qnz.bms.mapper;

import com.qnz.bms.domain.AreaCode;
import com.qnz.bms.domain.AreaCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaCodeMapper {
    long countByExample(AreaCodeExample example);

    int deleteByExample(AreaCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AreaCode record);

    int insertSelective(AreaCode record);

    List<AreaCode> selectByExample(AreaCodeExample example);

    AreaCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AreaCode record, @Param("example") AreaCodeExample example);

    int updateByExample(@Param("record") AreaCode record, @Param("example") AreaCodeExample example);

    int updateByPrimaryKeySelective(AreaCode record);

    int updateByPrimaryKey(AreaCode record);
}