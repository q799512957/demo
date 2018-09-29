package com.activiti.demo.decision.entity;

import java.util.Date;

public class SHRecord {
    private String hrId;

    private String presideOrg;

    private Date startTime;

    private Date endTime;

    private String thirdParty;

    private String thirdGender;

    private Short thirdAge;

    private String thirdUnit;

    private String thirdPosition;

    private String otherParticipants;

    private String otherGender;

    private Short otherAge;

    private String otherUnit;

    private String otherPosition;

    private Date recordSignTime;

    private Date recordTime;

    private String caseInfoId;

    private String record;

    private String content;

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
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

    public String getPresideOrg() {
        return presideOrg;
    }

    public void setPresideOrg(String presideOrg) {
        this.presideOrg = presideOrg == null ? null : presideOrg.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getThirdParty() {
        return thirdParty;
    }

    public void setThirdParty(String thirdParty) {
        this.thirdParty = thirdParty == null ? null : thirdParty.trim();
    }

    public String getThirdGender() {
        return thirdGender;
    }

    public void setThirdGender(String thirdGender) {
        this.thirdGender = thirdGender == null ? null : thirdGender.trim();
    }

    public Short getThirdAge() {
        return thirdAge;
    }

    public void setThirdAge(Short thirdAge) {
        this.thirdAge = thirdAge;
    }

    public String getThirdUnit() {
        return thirdUnit;
    }

    public void setThirdUnit(String thirdUnit) {
        this.thirdUnit = thirdUnit == null ? null : thirdUnit.trim();
    }

    public String getThirdPosition() {
        return thirdPosition;
    }

    public void setThirdPosition(String thirdPosition) {
        this.thirdPosition = thirdPosition == null ? null : thirdPosition.trim();
    }

    public String getOtherParticipants() {
        return otherParticipants;
    }

    public void setOtherParticipants(String otherParticipants) {
        this.otherParticipants = otherParticipants == null ? null : otherParticipants.trim();
    }

    public String getOtherGender() {
        return otherGender;
    }

    public void setOtherGender(String otherGender) {
        this.otherGender = otherGender == null ? null : otherGender.trim();
    }

    public Short getOtherAge() {
        return otherAge;
    }

    public void setOtherAge(Short otherAge) {
        this.otherAge = otherAge;
    }

    public String getOtherUnit() {
        return otherUnit;
    }

    public void setOtherUnit(String otherUnit) {
        this.otherUnit = otherUnit == null ? null : otherUnit.trim();
    }

    public String getOtherPosition() {
        return otherPosition;
    }

    public void setOtherPosition(String otherPosition) {
        this.otherPosition = otherPosition == null ? null : otherPosition.trim();
    }

    public Date getRecordSignTime() {
        return recordSignTime;
    }

    public void setRecordSignTime(Date recordSignTime) {
        this.recordSignTime = recordSignTime;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}