package com.activiti.demo.decision.entity;

import java.util.Date;

public class SHEntrustment {
    private String heId;

    private String consignerName;

    private String consignerGender;

    private String consignerPosition;

    private String consignerUnit;

    private String consignerTel;

    private String consignerAddr;

    private String consignerPostCode;

    private String agentName;

    private String agentGender;

    private String agentPosition;

    private String agentUnit;

    private String agentTel;

    private String agentAddr;

    private String agentPostCode;

    private Date consignerSignDate;

    private Date agentSignDate;

    private String caseInfoId;

    private String agentAuthority;

    private String content;

    public String getAgentAuthority() {
        return agentAuthority;
    }

    public void setAgentAuthority(String agentAuthority) {
        this.agentAuthority = agentAuthority == null ? null : agentAuthority.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getHeId() {
        return heId;
    }

    public void setHeId(String heId) {
        this.heId = heId == null ? null : heId.trim();
    }

    public String getConsignerName() {
        return consignerName;
    }

    public void setConsignerName(String consignerName) {
        this.consignerName = consignerName == null ? null : consignerName.trim();
    }

    public String getConsignerGender() {
        return consignerGender;
    }

    public void setConsignerGender(String consignerGender) {
        this.consignerGender = consignerGender == null ? null : consignerGender.trim();
    }

    public String getConsignerPosition() {
        return consignerPosition;
    }

    public void setConsignerPosition(String consignerPosition) {
        this.consignerPosition = consignerPosition == null ? null : consignerPosition.trim();
    }

    public String getConsignerUnit() {
        return consignerUnit;
    }

    public void setConsignerUnit(String consignerUnit) {
        this.consignerUnit = consignerUnit == null ? null : consignerUnit.trim();
    }

    public String getConsignerTel() {
        return consignerTel;
    }

    public void setConsignerTel(String consignerTel) {
        this.consignerTel = consignerTel == null ? null : consignerTel.trim();
    }

    public String getConsignerAddr() {
        return consignerAddr;
    }

    public void setConsignerAddr(String consignerAddr) {
        this.consignerAddr = consignerAddr == null ? null : consignerAddr.trim();
    }

    public String getConsignerPostCode() {
        return consignerPostCode;
    }

    public void setConsignerPostCode(String consignerPostCode) {
        this.consignerPostCode = consignerPostCode == null ? null : consignerPostCode.trim();
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName == null ? null : agentName.trim();
    }

    public String getAgentGender() {
        return agentGender;
    }

    public void setAgentGender(String agentGender) {
        this.agentGender = agentGender == null ? null : agentGender.trim();
    }

    public String getAgentPosition() {
        return agentPosition;
    }

    public void setAgentPosition(String agentPosition) {
        this.agentPosition = agentPosition == null ? null : agentPosition.trim();
    }

    public String getAgentUnit() {
        return agentUnit;
    }

    public void setAgentUnit(String agentUnit) {
        this.agentUnit = agentUnit == null ? null : agentUnit.trim();
    }

    public String getAgentTel() {
        return agentTel;
    }

    public void setAgentTel(String agentTel) {
        this.agentTel = agentTel == null ? null : agentTel.trim();
    }

    public String getAgentAddr() {
        return agentAddr;
    }

    public void setAgentAddr(String agentAddr) {
        this.agentAddr = agentAddr == null ? null : agentAddr.trim();
    }

    public String getAgentPostCode() {
        return agentPostCode;
    }

    public void setAgentPostCode(String agentPostCode) {
        this.agentPostCode = agentPostCode == null ? null : agentPostCode.trim();
    }

    public Date getConsignerSignDate() {
        return consignerSignDate;
    }

    public void setConsignerSignDate(Date consignerSignDate) {
        this.consignerSignDate = consignerSignDate;
    }

    public Date getAgentSignDate() {
        return agentSignDate;
    }

    public void setAgentSignDate(Date agentSignDate) {
        this.agentSignDate = agentSignDate;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}