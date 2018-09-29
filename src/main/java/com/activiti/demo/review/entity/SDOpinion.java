package com.activiti.demo.review.entity;

import java.util.Date;

public class SDOpinion {
    private String cdoId;

    private String investigateResult;

    private Date enforcerSignDate;

    private Date legalOrgSignDate;

    private Date enforceOrgSignDate;

    private String caseInfoId;
    private String process;

    private String disposalSuggestion;

    private String legalOrgOp;

    private String enforceOrgOp;

    private String content;

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }

    public String getDisposalSuggestion() {
        return disposalSuggestion;
    }

    public void setDisposalSuggestion(String disposalSuggestion) {
        this.disposalSuggestion = disposalSuggestion == null ? null : disposalSuggestion.trim();
    }

    public String getLegalOrgOp() {
        return legalOrgOp;
    }

    public void setLegalOrgOp(String legalOrgOp) {
        this.legalOrgOp = legalOrgOp == null ? null : legalOrgOp.trim();
    }

    public String getEnforceOrgOp() {
        return enforceOrgOp;
    }

    public void setEnforceOrgOp(String enforceOrgOp) {
        this.enforceOrgOp = enforceOrgOp == null ? null : enforceOrgOp.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCdoId() {
        return cdoId;
    }

    public void setCdoId(String cdoId) {
        this.cdoId = cdoId == null ? null : cdoId.trim();
    }

    public String getInvestigateResult() {
        return investigateResult;
    }

    public void setInvestigateResult(String investigateResult) {
        this.investigateResult = investigateResult == null ? null : investigateResult.trim();
    }

    public Date getEnforcerSignDate() {
        return enforcerSignDate;
    }

    public void setEnforcerSignDate(Date enforcerSignDate) {
        this.enforcerSignDate = enforcerSignDate;
    }

    public Date getLegalOrgSignDate() {
        return legalOrgSignDate;
    }

    public void setLegalOrgSignDate(Date legalOrgSignDate) {
        this.legalOrgSignDate = legalOrgSignDate;
    }

    public Date getEnforceOrgSignDate() {
        return enforceOrgSignDate;
    }

    public void setEnforceOrgSignDate(Date enforceOrgSignDate) {
        this.enforceOrgSignDate = enforceOrgSignDate;
    }

    public String getCaseInfoId() {
        return caseInfoId;
    }

    public void setCaseInfoId(String caseInfoId) {
        this.caseInfoId = caseInfoId == null ? null : caseInfoId.trim();
    }
}