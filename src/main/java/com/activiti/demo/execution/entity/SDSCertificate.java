package com.activiti.demo.execution.entity;

import java.util.Date;

public class SDSCertificate {
    private String dscId;

    private String chooseDocUnit;

    private String chooseDocPerson;

    private String collAgent;

    private Date servProofDate;

    private String documentName;

    private String documentNo;

    private Date servDate;

    private String servPlace;

    private String servType;

    private String servPerson;

    private String caseInfoId;

    private String content;

    public String getDscId() {
        return dscId;
    }

    public void setDscId(String dscId) {
        this.dscId = dscId == null ? null : dscId.trim();
    }

    public String getChooseDocUnit() {
        return chooseDocUnit;
    }

    public void setChooseDocUnit(String chooseDocUnit) {
        this.chooseDocUnit = chooseDocUnit == null ? null : chooseDocUnit.trim();
    }

    public String getChooseDocPerson() {
        return chooseDocPerson;
    }

    public void setChooseDocPerson(String chooseDocPerson) {
        this.chooseDocPerson = chooseDocPerson == null ? null : chooseDocPerson.trim();
    }

    public String getCollAgent() {
        return collAgent;
    }

    public void setCollAgent(String collAgent) {
        this.collAgent = collAgent == null ? null : collAgent.trim();
    }

    public Date getServProofDate() {
        return servProofDate;
    }

    public void setServProofDate(Date servProofDate) {
        this.servProofDate = servProofDate;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName == null ? null : documentName.trim();
    }

    public String getDocumentNo() {
        return documentNo;
    }

    public void setDocumentNo(String documentNo) {
        this.documentNo = documentNo == null ? null : documentNo.trim();
    }

    public Date getServDate() {
        return servDate;
    }

    public void setServDate(Date servDate) {
        this.servDate = servDate;
    }

    public String getServPlace() {
        return servPlace;
    }

    public void setServPlace(String servPlace) {
        this.servPlace = servPlace == null ? null : servPlace.trim();
    }

    public String getServType() {
        return servType;
    }

    public void setServType(String servType) {
        this.servType = servType == null ? null : servType.trim();
    }

    public String getServPerson() {
        return servPerson;
    }

    public void setServPerson(String servPerson) {
        this.servPerson = servPerson == null ? null : servPerson.trim();
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