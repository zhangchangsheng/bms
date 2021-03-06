package com.qnz.bms.mapper;

import com.qnz.bms.domain.Purview;
import com.qnz.bms.domain.PurviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purview
     *
     * @mbg.generated
     */
    long countByExample(PurviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purview
     *
     * @mbg.generated
     */
    int deleteByExample(PurviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purview
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purview
     *
     * @mbg.generated
     */
    int insert(Purview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purview
     *
     * @mbg.generated
     */
    int insertSelective(Purview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purview
     *
     * @mbg.generated
     */
    List<Purview> selectByExample(PurviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purview
     *
     * @mbg.generated
     */
    Purview selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purview
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Purview record, @Param("example") PurviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purview
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Purview record, @Param("example") PurviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purview
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Purview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purview
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Purview record);

    List<Purview> selectByRoleId(@Param("roleId") Integer roleId);
}