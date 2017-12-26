package com.qnz.common.utils;

public class PageExample {
    protected Integer pageNum;
    protected Integer pageSize = 10;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartRow() {
        if (pageNum == null) return null;
        int startRow = pageNum;
        return startRow <= 1 ? startRow : (startRow - 1) * pageSize;
    }

}
