package com.activiti.demo.decision.service;

import com.activiti.demo.decision.entity.SPDecision;

import java.util.List;
import java.util.Map;

public interface SPDecisionService {

    boolean insert(SPDecision spDecision);

    boolean update(SPDecision spDecision);

    List<Map<String,Object>> getList(String caseInfoId);


}
