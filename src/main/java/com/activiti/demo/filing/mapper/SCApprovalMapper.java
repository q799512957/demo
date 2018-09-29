package com.activiti.demo.filing.mapper;

import com.activiti.demo.filing.entity.SCApproval;

import java.util.List;
import java.util.Map;

public interface SCApprovalMapper {

    int insert(SCApproval scApproval);

    int update(SCApproval scApproval);

    List<Map<String,Object>> getList(String caseInfoId);
}