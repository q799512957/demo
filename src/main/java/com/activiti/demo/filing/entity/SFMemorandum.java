package com.activiti.demo.filing.entity;

import java.util.Date;

public class SFMemorandum {
    private String fmId;

    private String fileNo;

    private String filingNo;

    private String preservationPeriod;

    private String fillingPerson;

    private String checker;

    private Date fillingTime;

    private String caseInfoId;

    private String fileDescription;

    private String content;

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription == null ? null : fileDescription.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

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

    public String getFilingNo() {
        return filingNo;
    }

    public void setFilingNo(String filingNo) {
        this.filingNo = filingNo == null ? null : filingNo.trim();
    }

    public String getPreservationPeriod() {
        return preservationPeriod;
    }

    public void setPreservationPeriod(String preservationPeriod) {
        this.preservationPeriod = preservationPeriod == null ? null : preservationPeriod.trim();
    }

    public String getFillingPerson() {
        return fillingPerson;
    }

    public void setFillingPerson(String fillingPerson) {
        this.fillingPerson = fillingPerson == null ? null : fillingPerson.trim();
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public Date getFillingTime() {
        return fillingTime;
    }

    public void setFillingTime(Date fillingTime) {
        this.fillingTime = fillingTime;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}