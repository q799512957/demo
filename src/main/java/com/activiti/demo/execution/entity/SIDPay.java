package com.activiti.demo.execution.entity;

import java.util.Date;

public class SIDPay {
    private String idpaId;

    private Date idpaDate;

    private Date enforcerSignTime;

    private Date enforceOrgExamTime;

    private String caseInfoId;

    private String reason;

    private String enforcerOpinion;

    private String enforceOrgOpinion;

    private String content;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getEnforcerOpinion() {
        return enforcerOpinion;
    }

    public void setEnforcerOpinion(String enforcerOpinion) {
        this.enforcerOpinion = enforcerOpinion == null ? null : enforcerOpinion.trim();
    }

    public String getEnforceOrgOpinion() {
        return enforceOrgOpinion;
    }

    public void setEnforceOrgOpinion(String enforceOrgOpinion) {
        this.enforceOrgOpinion = enforceOrgOpinion == null ? null : enforceOrgOpinion.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getIdpaId() {
        return idpaId;
    }

    public void setIdpaId(String idpaId) {
        this.idpaId = idpaId == null ? null : idpaId.trim();
    }

    public Date getIdpaDate() {
        return idpaDate;
    }

    public void setIdpaDate(Date idpaDate) {
        this.idpaDate = idpaDate;
    }

    public Date getEnforcerSignTime() {
        return enforcerSignTime;
    }

    public void setEnforcerSignTime(Date enforcerSignTime) {
        this.enforcerSignTime = enforcerSignTime;
    }

    public Date getEnforceOrgExamTime() {
        return enforceOrgExamTime;
    }

    public void setEnforceOrgExamTime(Date enforceOrgExamTime) {
        this.enforceOrgExamTime = enforceOrgExamTime;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}