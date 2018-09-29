package com.activiti.demo.review.entity;

import java.util.Date;

public class SEDisposal {
    private String eddId;

    private Date decisionDate;

    private String caseInfoId;

    private String decision;

    private String content;

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision == null ? null : decision.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getEddId() {
        return eddId;
    }

    public void setEddId(String eddId) {
        this.eddId = eddId == null ? null : eddId.trim();
    }

    public Date getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(Date decisionDate) {
        this.decisionDate = decisionDate;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}