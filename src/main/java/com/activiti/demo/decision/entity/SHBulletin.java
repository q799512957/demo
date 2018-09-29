package com.activiti.demo.decision.entity;

import java.util.Date;

public class SHBulletin {
    private String hbId;

    private Date applicationDate;

    private String organization;

    private Date signUpStartTime;

    private Date signUpEndTime;

    private String signUpLocation;

    private Date announcementDate;

    private String caseInfoId;
    private String supportMateria;

    private String attendQualification;

    private String attention;

    private String content;

    public String getSupportMateria() {
        return supportMateria;
    }

    public void setSupportMateria(String supportMateria) {
        this.supportMateria = supportMateria == null ? null : supportMateria.trim();
    }

    public String getAttendQualification() {
        return attendQualification;
    }

    public void setAttendQualification(String attendQualification) {
        this.attendQualification = attendQualification == null ? null : attendQualification.trim();
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention == null ? null : attention.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getHbId() {
        return hbId;
    }

    public void setHbId(String hbId) {
        this.hbId = hbId == null ? null : hbId.trim();
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization == null ? null : organization.trim();
    }

    public Date getSignUpStartTime() {
        return signUpStartTime;
    }

    public void setSignUpStartTime(Date signUpStartTime) {
        this.signUpStartTime = signUpStartTime;
    }

    public Date getSignUpEndTime() {
        return signUpEndTime;
    }

    public void setSignUpEndTime(Date signUpEndTime) {
        this.signUpEndTime = signUpEndTime;
    }

    public String getSignUpLocation() {
        return signUpLocation;
    }

    public void setSignUpLocation(String signUpLocation) {
        this.signUpLocation = signUpLocation == null ? null : signUpLocation.trim();
    }

    public Date getAnnouncementDate() {
        return announcementDate;
    }

    public void setAnnouncementDate(Date announcementDate) {
        this.announcementDate = announcementDate;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}