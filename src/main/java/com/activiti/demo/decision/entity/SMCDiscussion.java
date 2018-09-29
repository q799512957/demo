package com.activiti.demo.decision.entity;

import java.util.Date;

public class SMCDiscussion {
    private String mcdId;

    private Date startTime;

    private Date endTime;

    private String place;

    private String presider;

    private String recorder;

    private String reporter;

    private String attendees;

    private String caseInfoId;

    private String record;

    private String conclusionOpinion;

    private String content;

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record == null ? null : record.trim();
    }

    public String getConclusionOpinion() {
        return conclusionOpinion;
    }

    public void setConclusionOpinion(String conclusionOpinion) {
        this.conclusionOpinion = conclusionOpinion == null ? null : conclusionOpinion.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getMcdId() {
        return mcdId;
    }

    public void setMcdId(String mcdId) {
        this.mcdId = mcdId == null ? null : mcdId.trim();
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place == null ? null : place.trim();
    }

    public String getPresider() {
        return presider;
    }

    public void setPresider(String presider) {
        this.presider = presider == null ? null : presider.trim();
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder == null ? null : recorder.trim();
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter == null ? null : reporter.trim();
    }

    public String getAttendees() {
        return attendees;
    }

    public void setAttendees(String attendees) {
        this.attendees = attendees == null ? null : attendees.trim();
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}