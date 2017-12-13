package com.qnz.bms.mapper;

import com.qnz.bms.domain.Linkage;
import com.qnz.bms.domain.LinkageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkageMapper {
    long countByExample(LinkageExample example);

    int deleteByExample(LinkageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Linkage record);

    int insertSelective(Linkage record);

    List<Linkage> selectByExample(LinkageExample example);

    Linkage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Linkage record, @Param("example") LinkageExample example);

    int updateByExample(@Param("record") Linkage record, @Param("example") LinkageExample example);

    int updateByPrimaryKeySelective(Linkage record);

    int updateByPrimaryKey(Linkage record);
}