package com.activiti.demo.execution.entity;

import java.math.BigDecimal;
import java.util.Date;

public class SIFNotice {
    private String ifnId;

    private Date delayDeadline;

    private String instalmentNo;

    private Date instalmentdeadline;

    private BigDecimal instalmentAmout;

    private BigDecimal instalmentUnpaidAmount;

    private String caseInfoId;

    private String content;

    public String getIfnId() {
        return ifnId;
    }

    public void setIfnId(String ifnId) {
        this.ifnId = ifnId == null ? null : ifnId.trim();
    }

    public Date getDelayDeadline() {
        return delayDeadline;
    }

    public void setDelayDeadline(Date delayDeadline) {
        this.delayDeadline = delayDeadline;
    }

    public String getInstalmentNo() {
        return instalmentNo;
    }

    public void setInstalmentNo(String instalmentNo) {
        this.instalmentNo = instalmentNo == null ? null : instalmentNo.trim();
    }

    public Date getInstalmentdeadline() {
        return instalmentdeadline;
    }

    public void setInstalmentdeadline(Date instalmentdeadline) {
        this.instalmentdeadline = instalmentdeadline;
    }

    public BigDecimal getInstalmentAmout() {
        return instalmentAmout;
    }

    public void setInstalmentAmout(BigDecimal instalmentAmout) {
        this.instalmentAmout = instalmentAmout;
    }

    public BigDecimal getInstalmentUnpaidAmount() {
        return instalmentUnpaidAmount;
    }

    public void setInstalmentUnpaidAmount(BigDecimal instalmentUnpaidAmount) {
        this.instalmentUnpaidAmount = instalmentUnpaidAmount;
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