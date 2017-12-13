package com.qnz.bms.domain;

import java.io.Serializable;

public class UserRolePurview implements Serializable {
    private Integer id;

    private Integer userRoleId;

    private Integer purviewId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    public Integer getPurviewId() {
        return purviewId;
    }

    public void setPurviewId(Integer purviewId) {
        this.purviewId = purviewId;
    }

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
        UserRolePurview other = (UserRolePurview) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserRoleId() == null ? other.getUserRoleId() == null : this.getUserRoleId().equals(other.getUserRoleId()))
            && (this.getPurviewId() == null ? other.getPurviewId() == null : this.getPurviewId().equals(other.getPurviewId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserRoleId() == null) ? 0 : getUserRoleId().hashCode());
        result = prime * result + ((getPurviewId() == null) ? 0 : getPurviewId().hashCode());
        return result;
    }
}