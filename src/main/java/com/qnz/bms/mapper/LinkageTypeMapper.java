package com.qnz.bms.mapper;

import com.qnz.bms.domain.LinkageType;
import com.qnz.bms.domain.LinkageTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkageTypeMapper {
    long countByExample(LinkageTypeExample example);

    int deleteByExample(LinkageTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LinkageType record);

    int insertSelective(LinkageType record);

    List<LinkageType> selectByExample(LinkageTypeExample example);

    LinkageType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LinkageType record, @Param("example") LinkageTypeExample example);

    int updateByExample(@Param("record") LinkageType record, @Param("example") LinkageTypeExample example);

    int updateByPrimaryKeySelective(LinkageType record);

    int updateByPrimaryKey(LinkageType record);
}