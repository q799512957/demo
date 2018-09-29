package com.activiti.demo.execution.entity;

public class SPReport {

    private String prId;

    private String caseInfoId;

    private String desposalResult;

    private String executCondition;

    private String content;

    public String getDesposalResult() {
        return desposalResult;
    }

    public void setDesposalResult(String desposalResult) {
        this.desposalResult = desposalResult == null ? null : desposalResult.trim();
    }

    public String getExecutCondition() {
        return executCondition;
    }

    public void setExecutCondition(String executCondition) {
        this.executCondition = executCondition == null ? null : executCondition.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPrId() {
        return prId;
    }

    public void setPrId(String prId) {
        this.prId = prId == null ? null : prId.trim();
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}