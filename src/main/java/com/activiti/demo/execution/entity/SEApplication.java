package com.activiti.demo.execution.entity;

public class SEApplication {
    private String eaId;

    private String court;

    private String askPerson;

    private String caseInfoId;

    private String content;

    private String content2;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getContent2() {
        return content2;
    }

    public void setContent2(String content2) {
        this.content2 = content2 == null ? null : content2.trim();
    }

    public String getEaId() {
        return eaId;
    }

    public void setEaId(String eaId) {
        this.eaId = eaId == null ? null : eaId.trim();
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court == null ? null : court.trim();
    }

    public String getAskPerson() {
        return askPerson;
    }

    public void setAskPerson(String askPerson) {
        this.askPerson = askPerson == null ? null : askPerson.trim();
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}