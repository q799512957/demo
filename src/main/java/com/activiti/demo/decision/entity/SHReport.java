package com.activiti.demo.decision.entity;

import java.util.Date;

public class SHReport {
    private String hrId;

    private Date presiderSignTime;

    private Date enforceOrgSignDate;

    private String caseInfoId;

    private String basicInfo;

    private String conclusion;

    private String disposalSuggestion;

    private String enforceOrgOp;

    private String content;

    public String getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(String basicInfo) {
        this.basicInfo = basicInfo == null ? null : basicInfo.trim();
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }

    public String getDisposalSuggestion() {
        return disposalSuggestion;
    }

    public void setDisposalSuggestion(String disposalSuggestion) {
        this.disposalSuggestion = disposalSuggestion == null ? null : disposalSuggestion.trim();
    }

    public String getEnforceOrgOp() {
        return enforceOrgOp;
    }

    public void setEnforceOrgOp(String enforceOrgOp) {
        this.enforceOrgOp = enforceOrgOp == null ? null : enforceOrgOp.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getHrId() {
        return hrId;
    }

    public void setHrId(String hrId) {
        this.hrId = hrId == null ? null : hrId.trim();
    }

    public Date getPresiderSignTime() {
        return presiderSignTime;
    }

    public void setPresiderSignTime(Date presiderSignTime) {
        this.presiderSignTime = presiderSignTime;
    }

    public Date getEnforceOrgSignDate() {
        return enforceOrgSignDate;
    }

    public void setEnforceOrgSignDate(Date enforceOrgSignDate) {
        this.enforceOrgSignDate = enforceOrgSignDate;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}