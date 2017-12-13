package com.qnz.bms.domain;

import java.io.Serializable;

public class AreaCode implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area_code.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area_code.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area_code.province
     *
     * @mbg.generated
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area_code.city
     *
     * @mbg.generated
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area_code.county
     *
     * @mbg.generated
     */
    private String county;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area_code.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area_code.pcode
     *
     * @mbg.generated
     */
    private String pcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column area_code.tcode
     *
     * @mbg.generated
     */
    private String tcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table area_code
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area_code.id
     *
     * @return the value of area_code.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area_code.id
     *
     * @param id the value for area_code.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area_code.pid
     *
     * @return the value of area_code.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area_code.pid
     *
     * @param pid the value for area_code.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area_code.province
     *
     * @return the value of area_code.province
     *
     * @mbg.generated
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area_code.province
     *
     * @param province the value for area_code.province
     *
     * @mbg.generated
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area_code.city
     *
     * @return the value of area_code.city
     *
     * @mbg.generated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area_code.city
     *
     * @param city the value for area_code.city
     *
     * @mbg.generated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area_code.county
     *
     * @return the value of area_code.county
     *
     * @mbg.generated
     */
    public String getCounty() {
        return county;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area_code.county
     *
     * @param county the value for area_code.county
     *
     * @mbg.generated
     */
    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area_code.code
     *
     * @return the value of area_code.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area_code.code
     *
     * @param code the value for area_code.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area_code.pcode
     *
     * @return the value of area_code.pcode
     *
     * @mbg.generated
     */
    public String getPcode() {
        return pcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area_code.pcode
     *
     * @param pcode the value for area_code.pcode
     *
     * @mbg.generated
     */
    public void setPcode(String pcode) {
        this.pcode = pcode == null ? null : pcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column area_code.tcode
     *
     * @return the value of area_code.tcode
     *
     * @mbg.generated
     */
    public String getTcode() {
        return tcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column area_code.tcode
     *
     * @param tcode the value for area_code.tcode
     *
     * @mbg.generated
     */
    public void setTcode(String tcode) {
        this.tcode = tcode == null ? null : tcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_code
     *
     * @mbg.generated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AreaCode other = (AreaCode) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getCounty() == null ? other.getCounty() == null : this.getCounty().equals(other.getCounty()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getPcode() == null ? other.getPcode() == null : this.getPcode().equals(other.getPcode()))
            && (this.getTcode() == null ? other.getTcode() == null : this.getTcode().equals(other.getTcode()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table area_code
     *
     * @mbg.generated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getCounty() == null) ? 0 : getCounty().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getPcode() == null) ? 0 : getPcode().hashCode());
        result = prime * result + ((getTcode() == null) ? 0 : getTcode().hashCode());
        return result;
    }
}