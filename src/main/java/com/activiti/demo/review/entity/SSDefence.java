package com.activiti.demo.review.entity;

import java.util.Date;

public class SSDefence {
    private String sadId;

    private Date sadDate;

    private Date startingTime;

    private Date closingTime;

    private String place;

    private String person;

    private String personGender;

    private String personUnit;

    private String personPosition;

    private String personTel;

    private String personAddr;

    private String personPostCode;

    private String recorder;

    private Date signDate;

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

    public String getSadId() {
        return sadId;
    }

    public void setSadId(String sadId) {
        this.sadId = sadId == null ? null : sadId.trim();
    }

    public Date getSadDate() {
        return sadDate;
    }

    public void setSadDate(Date sadDate) {
        this.sadDate = sadDate;
    }

    public Date getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(Date startingTime) {
        this.startingTime = startingTime;
    }

    public Date getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(Date closingTime) {
        this.closingTime = closingTime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person == null ? null : person.trim();
    }

    public String getPersonGender() {
        return personGender;
    }

    public void setPersonGender(String personGender) {
        this.personGender = personGender == null ? null : personGender.trim();
    }

    public String getPersonUnit() {
        return personUnit;
    }

    public void setPersonUnit(String personUnit) {
        this.personUnit = personUnit == null ? null : personUnit.trim();
    }

    public String getPersonPosition() {
        return personPosition;
    }

    public void setPersonPosition(String personPosition) {
        this.personPosition = personPosition == null ? null : personPosition.trim();
    }

    public String getPersonTel() {
        return personTel;
    }

    public void setPersonTel(String personTel) {
        this.personTel = personTel == null ? null : personTel.trim();
    }

    public String getPersonAddr() {
        return personAddr;
    }

    public void setPersonAddr(String personAddr) {
        this.personAddr = personAddr == null ? null : personAddr.trim();
    }

    public String getPersonPostCode() {
        return personPostCode;
    }

    public void setPersonPostCode(String personPostCode) {
        this.personPostCode = personPostCode == null ? null : personPostCode.trim();
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder == null ? null : recorder.trim();
    }

    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}