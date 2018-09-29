package com.activiti.demo.decision.entity;

import java.util.Date;

public class SPDecision {
    private String pdlId;

    private String punishMethod;

    private String bankName;

    private String accountName;

    private String reconsiderationOrg;

    private String punishType;

    private Date punishDate;

    private String punishLetterNo;

    private String caseInfoId;

    private String content;

    public String getPdlId() {
        return pdlId;
    }

    public void setPdlId(String pdlId) {
        this.pdlId = pdlId == null ? null : pdlId.trim();
    }

    public String getPunishMethod() {
        return punishMethod;
    }

    public void setPunishMethod(String punishMethod) {
        this.punishMethod = punishMethod == null ? null : punishMethod.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getReconsiderationOrg() {
        return reconsiderationOrg;
    }

    public void setReconsiderationOrg(String reconsiderationOrg) {
        this.reconsiderationOrg = reconsiderationOrg == null ? null : reconsiderationOrg.trim();
    }

    public String getPunishType() {
        return punishType;
    }

    public void setPunishType(String punishType) {
        this.punishType = punishType == null ? null : punishType.trim();
    }

    public Date getPunishDate() {
        return punishDate;
    }

    public void setPunishDate(Date punishDate) {
        this.punishDate = punishDate;
    }

    public String getPunishLetterNo() {
        return punishLetterNo;
    }

    public void setPunishLetterNo(String punishLetterNo) {
        this.punishLetterNo = punishLetterNo == null ? null : punishLetterNo.trim();
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