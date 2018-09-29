package com.activiti.demo.review.entity;

import java.util.Date;

public class SOCorrect {
    private String ocnId;

    private Date ocnDate;

    private Date signDate;

    private String caseInfoId;

    private String contentRequire;

    private String content;

    public String getContentRequire() {
        return contentRequire;
    }

    public void setContentRequire(String contentRequire) {
        this.contentRequire = contentRequire == null ? null : contentRequire.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getOcnId() {
        return ocnId;
    }

    public void setOcnId(String ocnId) {
        this.ocnId = ocnId == null ? null : ocnId.trim();
    }

    public Date getOcnDate() {
        return ocnDate;
    }

    public void setOcnDate(Date ocnDate) {
        this.ocnDate = ocnDate;
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}