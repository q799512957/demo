package com.activiti.demo.review.entity;

import java.math.BigDecimal;

public class SIAction {
    private String ianId;

    private BigDecimal amount;

    private Short informDefenceRight;

    private Short informHearRight;

    private String caseInfoId;

    private String regulationViolated;

    private String basis;

    private String decision;

    private String content;

    public String getRegulationViolated() {
        return regulationViolated;
    }

    public void setRegulationViolated(String regulationViolated) {
        this.regulationViolated = regulationViolated == null ? null : regulationViolated.trim();
    }

    public String getBasis() {
        return basis;
    }

    public void setBasis(String basis) {
        this.basis = basis == null ? null : basis.trim();
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision == null ? null : decision.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getIanId() {
        return ianId;
    }

    public void setIanId(String ianId) {
        this.ianId = ianId == null ? null : ianId.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Short getInformDefenceRight() {
        return informDefenceRight;
    }

    public void setInformDefenceRight(Short informDefenceRight) {
        this.informDefenceRight = informDefenceRight;
    }

    public Short getInformHearRight() {
        return informHearRight;
    }

    public void setInformHearRight(Short informHearRight) {
        this.informHearRight = informHearRight;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}