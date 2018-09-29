package com.activiti.demo.filing.entity;

import java.util.Date;

public class SFMenu {
    private String fmId;

    private String fileNo;

    private Date fukeDate;

    private String fileTitle;

    private Short pageNum;

    private String caseInfoId;

    private String content;

    public String getFmId() {
        return fmId;
    }

    public void setFmId(String fmId) {
        this.fmId = fmId == null ? null : fmId.trim();
    }

    public String getFileNo() {
        return fileNo;
    }

    public void setFileNo(String fileNo) {
        this.fileNo = fileNo == null ? null : fileNo.trim();
    }

    public Date getFukeDate() {
        return fukeDate;
    }

    public void setFukeDate(Date fukeDate) {
        this.fukeDate = fukeDate;
    }

    public String getFileTitle() {
        return fileTitle;
    }

    public void setFileTitle(String fileTitle) {
        this.fileTitle = fileTitle == null ? null : fileTitle.trim();
    }

    public Short getPageNum() {
        return pageNum;
    }

    public void setPageNum(Short pageNum) {
        this.pageNum = pageNum;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}