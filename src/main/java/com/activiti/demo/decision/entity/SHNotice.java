package com.activiti.demo.decision.entity;

import java.util.Date;

public class SHNotice {
    private String hnId;

    private Date time;

    private String place;

    private String presiderName;

    private String presiderPosition;

    private String officerName;

    private String officerPosition;

    private String secretaryName;

    private String secretaryPosition;

    private Date noticeDate;

    private String caseInfoId;

    private String content;

    public String getHnId() {
        return hnId;
    }

    public void setHnId(String hnId) {
        this.hnId = hnId == null ? null : hnId.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getPresiderName() {
        return presiderName;
    }

    public void setPresiderName(String presiderName) {
        this.presiderName = presiderName == null ? null : presiderName.trim();
    }

    public String getPresiderPosition() {
        return presiderPosition;
    }

    public void setPresiderPosition(String presiderPosition) {
        this.presiderPosition = presiderPosition == null ? null : presiderPosition.trim();
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        this.officerName = officerName == null ? null : officerName.trim();
    }

    public String getOfficerPosition() {
        return officerPosition;
    }

    public void setOfficerPosition(String officerPosition) {
        this.officerPosition = officerPosition == null ? null : officerPosition.trim();
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    public void setSecretaryName(String secretaryName) {
        this.secretaryName = secretaryName == null ? null : secretaryName.trim();
    }

    public String getSecretaryPosition() {
        return secretaryPosition;
    }

    public void setSecretaryPosition(String secretaryPosition) {
        this.secretaryPosition = secretaryPosition == null ? null : secretaryPosition.trim();
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
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