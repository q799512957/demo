package com.activiti.demo.filing.service;

import com.activiti.demo.filing.entity.SCApproval;

import java.util.List;
import java.util.Map;

public interface SCApprovalService {

    boolean insert(SCApproval scApproval);

    boolean update(SCApproval scApproval);

    List<Map<String,Object>> getList(String caseInfoId);


}
